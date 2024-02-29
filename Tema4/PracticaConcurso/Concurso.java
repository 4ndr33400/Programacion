package PracticaConcurso;
import java.util.ArrayList;
import java.util.Random;


public class Concurso {
    private static ArrayList<Preguntas> preguntas;
    private static ArrayList<Premios> premios;
    private static Preguntas[][] contestTemplate;
    static Random random = new Random();
    public static void main(String[] args) {

    }

    public static Preguntas[][] createTemplate(){
        int rows = 5;
        int column = 5;
        contestTemplate = new Preguntas[rows][column];
        for (int x = 0; x < rows; x++){
            for (int y = 0; y < column;y++){
                if (x > 0 && y == 0){
                    contestTemplate[x][y] = new Casilla(randomQuestion(),)
                }
            }
        }
        return contestTemplate;
    }
    public static Preguntas randomQuestion(){
        ArrayList<Preguntas> preguntas = null;
        int randomTypeQuestion = random.nextInt(3);
        switch (randomTypeQuestion){
            case 1:
                preguntas = addABCQuestion();
            case 2:
                preguntas = addTFQuestion();
            case 3:
                preguntas = addFreeAnswer();
        }
        return preguntas.get(random.nextInt(preguntas.size()));
    }
    public static ArrayList<Preguntas> addABCQuestion(){

        ArrayList<String> options1 = new ArrayList<>();
        preguntas.add(new PreguntasABC("¿Cuál es el nombre del fontanero italiano protagonista del juego \"Super Mario Bros.\"?","a",options1));
        options1.add("A) Luigi");
        options1.add("B) Mario");
        options1.add("C) Bowser");
        ArrayList<String> options2 = new ArrayList<>();
        options2.add("A) Bungie");
        options2.add("B) Ubisoft");
        options2.add("C) Electronic Arts");
        preguntas.add(new PreguntasABC("¿Qué compañía desarrolló la serie de videojuegos \"Halo\"?", "A", options2));
        ArrayList<String> options3 = new ArrayList<>();
        options3.add("A) Minecraft");
        options3.add("B) Grand Theft Auto V");
        options3.add("C) Tetris");
        preguntas.add(new PreguntasABC("¿Cuál es el juego más vendido de todos los tiempos hasta la fecha?", "A", options3));
        ArrayList<String> options4 = new ArrayList<>();
        options4.add("A) Digimon World");
        options4.add("B) Final Fantasy");
        options4.add("C) Pokémon");
        preguntas.add(new PreguntasABC("¿Qué videojuego popular presenta un mundo abierto lleno de criaturas para atrapar llamadas Pokémon?", "C", options4));
        ArrayList<String> options5 = new ArrayList<>();
        options5.add("A) Hideo Kojima");
        options5.add("B) Shigeru Miyamoto");
        options5.add("C) Tim Schafer");
        preguntas.add(new PreguntasABC("¿Quién es el creador del juego \"The Legend of Zelda\"?", "B", options5));

        ArrayList<String> options6 = new ArrayList<>();
        options6.add("A) Lucha");
        options6.add("B) Plataforma");
        options6.add("C) Aventura");
        preguntas.add(new PreguntasABC("¿Cuál es el género principal del juego \"Street Fighter\"?", "A", options6));
        ArrayList<String> options7 = new ArrayList<>();
        options7.add("A) Ezio Auditore");
        options7.add("B) Altair Ibn-La'Ahad");
        options7.add("C) Connor Kenway");
        preguntas.add(new PreguntasABC("¿Cuál es el nombre del protagonista en la serie de videojuegos \"Assassin's Creed\"?", "A", options7));
        ArrayList<String> options8 = new ArrayList<>();
        options8.add("A) Call of Duty: Warzone");
        options8.add("B) PUBG (PlayerUnknown's Battlegrounds)");
        options8.add("C) Fortnite");
        preguntas.add(new PreguntasABC("¿Qué juego popular de battle royale fue desarrollado por Epic Games?", "C", options8));
        ArrayList<String> options9 = new ArrayList<>();
        options9.add("A) Final Fantasy VII");
        options9.add("B) Final Fantasy IX");
        options9.add("C) Final Fantasy X");
        preguntas.add(new PreguntasABC("¿Qué título de la serie \"Final Fantasy\" es considerado como uno de los más influyentes en la historia de los videojuegos?", "A", options9));
        ArrayList<String> options10 = new ArrayList<>();
        options10.add("A) Geralt de Rivia");
        options10.add("B) Ciri");
        options10.add("C) Yennefer");
        preguntas.add(new PreguntasABC("¿Cuál es el nombre del personaje principal en el juego \"The Witcher 3: Wild Hunt\"?", "A", options10));

        ArrayList<String> options11 = new ArrayList<>();
        options11.add("A) Need for Speed");
        options11.add("B) Forza Motorsport");
        options11.add("C) Gran Turismo");
        preguntas.add(new PreguntasABC("¿Qué juego popular de carreras presenta a personajes como Mario, Luigi y Yoshi compitiendo en karts?", "D", options11));
        ArrayList<String> options12 = new ArrayList<>();
        options12.add("A) Skyrim");
        options12.add("B) Morrowind");
        options12.add("C) Arena");
        preguntas.add(new PreguntasABC("¿Cuál es el título del primer juego de la serie \"The Elder Scrolls\" lanzado en 1994?", "C", options12));
        ArrayList<String> options13 = new ArrayList<>();
        options13.add("A) Terraria");
        options13.add("B) Stardew Valley");
        options13.add("C) Rust");
        preguntas.add(new PreguntasABC("¿Qué juego es conocido por su mundo de construcción y supervivencia, donde los jugadores pueden crear estructuras y explorar un vasto terreno?", "D", options13));
        ArrayList<String> options14 = new ArrayList<>();
        options14.add("A) Mass Effect");
        options14.add("B) Star Wars: Knights of the Old Republic");
        options14.add("C) Destiny");
        preguntas.add(new PreguntasABC("¿Qué serie de juegos se desarrolla en un universo de ciencia ficción donde los jugadores asumen el papel de un Comandante Shepard en una misión para salvar la galaxia?", "A", options14));
        ArrayList<String> options15 = new ArrayList<>();
        options15.add("A) Electronic Arts");
        options15.add("B) Ubisoft");
        options15.add("C) Rockstar Games");
        preguntas.add(new PreguntasABC("¿Cuál es el nombre del estudio de desarrollo detrás de la serie \"Grand Theft Auto\"?", "C", options15));

        ArrayList<String> options16 = new ArrayList<>();
        options16.add("A) Spyro the Dragon");
        options16.add("B) Banjo-Kazooie");
        options16.add("C) Rayman");
        preguntas.add(new PreguntasABC("¿Qué juego popular de plataformas lanzado en 1996 presentó a un marsupial llamado Crash Bandicoot como protagonista?", "D", options16));
        ArrayList<String> options17 = new ArrayList<>();
        options17.add("A) Resident Evil");
        options17.add("B) Silent Hill");
        options17.add("C) Dead Space");
        preguntas.add(new PreguntasABC("¿Cuál es el título del juego de terror de supervivencia en el que los jugadores controlan a un personaje llamado Jill Valentine mientras intenta escapar de una mansión infestada de zombis?", "A", options17));
        ArrayList<String> options18 = new ArrayList<>();
        options18.add("A) Uncharted");
        options18.add("B) Tomb Raider");
        options18.add("C) Prince of Persia");
        preguntas.add(new PreguntasABC("¿Qué videojuego de acción y aventura sigue las aventuras de Nathan Drake, un cazador de tesoros y explorador?", "A", options18));
        ArrayList<String> options19 = new ArrayList<>();
        options19.add("A) Marvel vs. Capcom");
        options19.add("B) Mortal Kombat");
        options19.add("C) Tekken");
        preguntas.add(new PreguntasABC("¿En qué juego de lucha se enfrentan personajes icónicos de franquicias como Street Fighter, Mega Man y Sonic the Hedgehog?", "A", options19));
        ArrayList<String> options20 = new ArrayList<>();
        options20.add("A) Baldur's Gate");
        options20.add("B) Diablo");
        options20.add("C) Planescape: Torment");
        preguntas.add(new PreguntasABC("¿Qué juego de rol occidental, lanzado en 1997, es conocido por su mundo abierto y su sistema de combate en tiempo real?", "A", options20));

        ArrayList<String> options21 = new ArrayList<>();
        options21.add("A) Counter-Strike: Global Offensive");
        options21.add("B) Team Fortress 2");
        options21.add("C) Overwatch");
        preguntas.add(new PreguntasABC("¿Qué juego de disparos en primera persona es conocido por su modo multijugador altamente competitivo y su comunidad activa?", "A", options21));
        ArrayList<String> options22 = new ArrayList<>();
        options22.add("A) Civilization");
        options22.add("B) Age of Empires");
        options22.add("C) StarCraft");
        preguntas.add(new PreguntasABC("¿Qué juego de estrategia en tiempo real permite a los jugadores construir y administrar su propio imperio desde la antigüedad hasta la era moderna?", "B", options22));
        ArrayList<String> options23 = new ArrayList<>();
        options23.add("A) Solid Snake");
        options23.add("B) Big Boss");
        options23.add("C) Liquid Snake");
        preguntas.add(new PreguntasABC("¿Cuál es el nombre del personaje principal en la serie de juegos \"Metal Gear Solid\"?", "A", options23));
        ArrayList<String> options24 = new ArrayList<>();
        options24.add("A) The Legend of Zelda");
        options24.add("B) Dark Souls");
        options24.add("C) Bloodborne");
        preguntas.add(new PreguntasABC("¿Qué juego de aventuras presenta a un grupo de personajes explorando un mundo de fantasía mientras luchan contra monstruos y jefes?", "A", options24));
        ArrayList<String> options25 = new ArrayList<>();
        options25.add("A) World of Warcraft");
        options25.add("B) Final Fantasy XIV");
        options25.add("C) Guild Wars 2");
        preguntas.add(new PreguntasABC("¿Qué juego de rol en línea masivo presenta un vasto mundo virtual donde los jugadores pueden explorar, luchar y socializar con otros?", "A", options25));
        return preguntas;
    }
    public static ArrayList<Preguntas> addFreeAnswer(){
        preguntas.add(new RespuestaAbierta("¿Cuál es el nombre del protagonista de la saga de videojuegos \"Uncharted\"?", "Nathan Drake"));
        preguntas.add(new RespuestaAbierta("¿Qué compañía desarrolló la serie de videojuegos \"The Elder Scrolls\"?", "Bethesda Softworks"));
        preguntas.add(new RespuestaAbierta("¿En qué año fue lanzado el primer juego de la serie \"Assassin's Creed\"?", "2007"));
        preguntas.add(new RespuestaAbierta("¿Quién es el creador del popular juego de rol \"The Witcher 3: Wild Hunt\"?", "CD Projekt Red"));
        preguntas.add(new RespuestaAbierta("¿Qué juego de estrategia en tiempo real presenta tres facciones diferentes: los Terran, los Zerg y los Protoss?", "StarCraft"));

        preguntas.add(new RespuestaAbierta("¿Cuál es el nombre del protagonista del juego \"The Legend of Zelda: Breath of the Wild\"?", "Link"));
        preguntas.add(new RespuestaAbierta("¿En qué año fue lanzado el primer juego de la serie \"Final Fantasy\"?", "1987"));
        preguntas.add(new RespuestaAbierta("¿Cuál es el nombre del antagonista principal en la serie de videojuegos \"Metal Gear Solid\"?", "Big Boss"));
        preguntas.add(new RespuestaAbierta("¿Qué juego popular presenta un mundo de construcción y supervivencia donde los jugadores pueden crear y explorar?", "Minecraft"));
        preguntas.add(new RespuestaAbierta("¿En qué juego de disparos en primera persona los jugadores controlan a un marine espacial luchando contra hordas de demonios en Marte?", "Doom"));

        preguntas.add(new RespuestaAbierta("¿Quién es el creador de la serie de videojuegos \"Final Fantasy\"?", "Hironobu Sakaguchi"));
        preguntas.add(new RespuestaAbierta("¿Cuál es el nombre del personaje principal en la serie de videojuegos \"God of War\"?", "Kratos"));
        preguntas.add(new RespuestaAbierta("¿En qué juego de rol en línea masivo los jugadores exploran un mundo de fantasía llamado Azeroth?", "World of Warcraft"));
        preguntas.add(new RespuestaAbierta("¿Cuál es el nombre del estudio de desarrollo detrás de la serie \"Grand Theft Auto\"?", "Rockstar Games"));
        preguntas.add(new RespuestaAbierta("¿En qué juego de lucha los personajes realizan movimientos especiales llamados \"Fatality\"?", "Mortal Kombat"));

        preguntas.add(new RespuestaAbierta("¿Cuál es el título del primer juego de la serie \"The Witcher\"?", "The Witcher"));
        preguntas.add(new RespuestaAbierta("¿Qué compañía desarrolló la serie de juegos de rol \"Mass Effect\"?", "BioWare"));
        preguntas.add(new RespuestaAbierta("¿Cuál es el nombre del planeta principal en la serie de videojuegos \"Halo\"?", "Reach"));
        preguntas.add(new RespuestaAbierta("¿En qué juego de plataformas el personaje principal debe rescatar a la princesa Peach del malvado Bowser?", "Super Mario"));
        preguntas.add(new RespuestaAbierta("¿Cuál es el nombre del protagonista del juego de aventuras \"The Last of Us\"?", "Joel"));

        preguntas.add(new RespuestaAbierta("¿Cuál es el nombre del protagonista del juego de acción y aventuras \"Devil May Cry\"?", "Dante"));
        preguntas.add(new RespuestaAbierta("¿En qué juego de estrategia los jugadores construyen y administran su propia ciudad desde la antigüedad hasta la era moderna?", "Civilization"));
        preguntas.add(new RespuestaAbierta("¿Cuál es el nombre del planeta donde se desarrolla la mayoría de la trama en el juego de ciencia ficción \"Mass Effect\"?", "Terra"));
        preguntas.add(new RespuestaAbierta("¿En qué juego de rol los jugadores asumen el papel de un niño/a que intenta convertirse en el mejor entrenador de Pokémon?", "Pokémon"));
        preguntas.add(new RespuestaAbierta("¿Cuál es el título del primer juego de la serie \"Dark Souls\"?", "Dark Souls"));

        return preguntas;
    }
    public static ArrayList<Preguntas> addTFQuestion(){
        preguntas.add(new VerdaderoFalso("El personaje principal en el juego \"The Legend of Zelda\" se llama Link.", true));
        preguntas.add(new VerdaderoFalso("El juego \"Minecraft\" fue lanzado en 2009.", true));
        preguntas.add(new VerdaderoFalso("El título \"Final Fantasy VI\" fue lanzado antes que \"Final Fantasy VII\".", true));
        preguntas.add(new VerdaderoFalso("El juego \"Red Dead Redemption\" fue desarrollado por Ubisoft.", false));
        preguntas.add(new VerdaderoFalso("El personaje principal en la serie de juegos \"Assassin's Creed\" es Ezio Auditore.", true));

        preguntas.add(new VerdaderoFalso("El juego \"Fortnite\" fue lanzado en 2017.", true));
        preguntas.add(new VerdaderoFalso("El título del primer juego de la serie \"Grand Theft Auto\" es \"Grand Theft Auto III\".", false));
        preguntas.add(new VerdaderoFalso("El juego \"Pac-Man\" fue lanzado en la década de 1980.", true));
        preguntas.add(new VerdaderoFalso("El juego \"Super Smash Bros.\" presenta personajes de varias franquicias de videojuegos luchando entre sí.", true));
        preguntas.add(new VerdaderoFalso("El título del primer juego de la serie \"Metal Gear Solid\" es \"Metal Gear Solid 2: Sons of Liberty\".", false));

        preguntas.add(new VerdaderoFalso("El juego \"Halo\" fue lanzado originalmente para la consola PlayStation.", false));
        preguntas.add(new VerdaderoFalso("El primer juego de la serie \"Assassin's Creed\" se desarrolla en la Italia renacentista.", true));
        preguntas.add(new VerdaderoFalso("El título \"The Witcher 3: Wild Hunt\" fue desarrollado por CD Projekt Red.", true));
        preguntas.add(new VerdaderoFalso("El juego \"Pac-Man\" fue creado por el diseñador japonés Hideo Kojima.", false));
        preguntas.add(new VerdaderoFalso("El título \"Gears of War\" es una serie de videojuegos de estrategia en tiempo real.", false));

        preguntas.add(new VerdaderoFalso("El juego \"Dark Souls\" es conocido por su alto nivel de dificultad.", true));
        preguntas.add(new VerdaderoFalso("El personaje principal en la serie \"Final Fantasy VII\" se llama Cloud Strife.", true));
        preguntas.add(new VerdaderoFalso("El juego \"The Last of Us\" fue desarrollado por Naughty Dog.", true));
        preguntas.add(new VerdaderoFalso("El título original del primer juego de la serie \"Mortal Kombat\" es \"Mortal Kombat: Deadly Alliance\".", false));
        preguntas.add(new VerdaderoFalso("El juego \"BioShock Infinite\" se desarrolla en la ciudad submarina de Rapture.", false));

        preguntas.add(new VerdaderoFalso("El juego \"Fortnite\" fue desarrollado por Epic Games.", true));
        preguntas.add(new VerdaderoFalso("El título original del primer juego de la serie \"Resident Evil\" es \"Biohazard\".", true));
        preguntas.add(new VerdaderoFalso("El personaje principal en la serie \"Metal Gear Solid\" se llama Solidus Snake.", false));
        preguntas.add(new VerdaderoFalso("El juego \"Super Mario Odyssey\" fue lanzado para la consola Xbox One.", false));
        preguntas.add(new VerdaderoFalso("El título \"Call of Duty: Modern Warfare\" es una precuela de la serie Call of Duty.", false));

        return  preguntas;
    }

}
