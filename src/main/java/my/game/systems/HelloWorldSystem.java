package my.game.systems;

import com.artemis.ComponentMapper;
import com.artemis.annotations.All;
import com.artemis.systems.IteratingSystem;
import my.game.components.Hello;

// Para suscribir su sistema a entidades de cierta composicion, use anotaciones de aspecto (las anotaciones se pueden combinar)
@All(Hello.class) // La entidad debe tener el componente "Hello"
// Los sistemas de iteracion (IteratingSystem) operan sobre entidades que coinciden con un determinado Aspecto
public class HelloWorldSystem extends IteratingSystem {

	/**
	 * Artemis-odb maneja la mayoria de la creacion de objetos por usted. Inyectara sistemas, mapeadores de componentes o cualquier otro objeto deseado en
	 * los sistemas de entidad, durante la inicializacion.
	 * <p>
	 * Los mapeadores de componentes proporcionan acceso y mutacion de componentes de alto rendimiento desde dentro de un sistema. Los
	 * mapeadores de componentes son tan rapidos como los transmutadores.
	 */
	protected ComponentMapper<Hello> mHello; // Utilizado para acceder al componente

	// Llamado para cada entidad coincidente
	@Override protected void process(int id) {
		System.out.print(mHello.get(id).message);

	}

}
