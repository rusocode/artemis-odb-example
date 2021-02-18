package my.game;

import com.artemis.*;
import my.game.components.Hello;
import my.game.systems.HelloWorldSystem;

public class GameLauncher {

	public static void main(String[] args) {
		// 1. Configura el mundo
		WorldConfiguration config = new WorldConfigurationBuilder().with(new HelloWorldSystem()).build();

		// 2. Crea el mundo y le pasa la configuracion
		World world = new World(config);

		// 3. Crea la entidad. Se puede hacer aca o dentro de los sistemas.
		int entityId = world.create();
		world.edit(entityId).create(Hello.class).message = "\n\rHola mundo!\n\r";

		// 4. Ejecuta el mundo. HelloWorldSystem deberia imprimir el mensaje de hola mundo.
		world.process();

		// Inyecta explicitamente un objeto
		// world.inject(obj);
	}

}
