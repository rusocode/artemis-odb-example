package my.game.systems;

import com.artemis.ComponentMapper;
import com.artemis.annotations.All;
import com.artemis.systems.IteratingSystem;
import my.game.components.Hello;

// Para suscribir su sistema a entidades de cierta composicion, use anotaciones de aspecto (las anotaciones se pueden combinar)
@All(Hello.class) // La entidad debe tener el componente "Hello"
// Los sistemas de iteracion (IteratingSystem) operan sobre entidades que coinciden con un determinado Aspecto
public class HelloWorldSystem extends IteratingSystem {

	protected ComponentMapper<Hello> mHello;

	@Override protected void process(int id) {
		System.out.print(mHello.get(id).message);
	}
}
