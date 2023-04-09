package tpIntegradorTorneo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MainTPIT {

	public static void main(String[] args) {
		
		Collection<Partido> partidos = new ArrayList<Partido>();
		
		//Leer archivo-resultado
		Path pathResultados = Paths.get(args[0]); //le paso el paths del archivo resultadosTest1.csv a "args"
		List<String> lineasResultados = null;
		try {
			lineasResultados = Files.readAllLines(pathResultados);
		} catch (IOException e) {
			System.out.println("No se pudo leer la línea resultados");
			System.exit(1);	//"NO! usar" en ninguna otra circunstacias, *es posible solo en el main*.
			System.out.println(e.getMessage()); //detalle del error
		}
		boolean primeraLinea = true;
		//forEach  recorrer colecciones/objetos código más limpio vs método size 
		for (String lineaResultado : lineasResultados) {
			if (primeraLinea) {
				primeraLinea = false;
			} else {
				//System.out.println(lineaResultado);
				//Argentina,1,2,Arabia Saudita
				String[] campos = lineaResultado.split(",");
				Equipo equipo1local = new Equipo(campos[0]);
				Equipo equipo2visitante = new Equipo(campos[3]);
				Partido partido = new Partido(equipo1local,equipo2visitante);
				partido.setGoles1local(Integer.parseInt(campos[1]) );
				partido.setGoles2visitante(Integer.parseInt(campos[2]) );
				partidos.add(partido);
			}
		}

		//Leer pronostico
		int puntos = 0;	// total puntos persona

		Path pathPronostico = Paths.get(args[1]); //le paso el paths del archivo pronosticoTest1.csv a "args"
		List<String> lineasPronostico = null;
		try {
			lineasPronostico = Files.readAllLines(pathPronostico);
		} catch (IOException e) {
			System.out.println("No se pudo leer la línea pronostico");
			System.exit(1);	//"NO! usar", únicamente en el main*.
			System.out.println(e.getMessage()); //detalle del error
		}
		primeraLinea = true;
		for (String lineaPronostico : lineasPronostico) {
			if (primeraLinea) {
				primeraLinea = false;
			} else {
				//System.out.println(lineaPronostico);
				String[] campos = lineaPronostico.split(",");
				Equipo equipo1local = new Equipo(campos[0]);
				Equipo equipo2visitante = new Equipo(campos[4]);
				Partido partido = null;

				for (Partido partidoColecc : partidos) {
					if (partidoColecc.getEquipo1local().getNombre().equals(equipo1local.getNombre()) && 
							(partidoColecc.getEquipo2visitante().getNombre().equals(equipo2visitante.getNombre()))) {

						partido = partidoColecc;
					}
				}
				Equipo equipo = null;
				ResultadoEnum resultado = null;	
				if ("X".equals(campos[1])); {
					equipo = equipo1local;
					resultado = ResultadoEnum.GANADOR;
				}
				if ("X".equals(campos[2])); {
					equipo = equipo1local;
					resultado = ResultadoEnum.EMPATE;
				}
				if ("X".equals(campos[3])); {
					equipo = equipo1local;
					resultado = ResultadoEnum.PERDEDOR;
				}
				Pronostico pronostico = new Pronostico(partido, equipo, resultado);
				//sumar los puntos correspondientes
				puntos += pronostico.puntos();
				}
			}
			//mostrar los puntos
			System.out.println("Puntos obtenidos por el Jugador: ");
			System.out.println(puntos);
		}
	}