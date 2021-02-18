package my.game.components;

import com.artemis.Component;

/**
 * Los componentes son clases de datos puras y minimas que se conectan a entidades para admitir algun comportamiento. Los componentes
 * proporcionan datos a las entidades. Un componente en si mismo no implementa ningun comportamiento.
 */
public class Hello extends Component {

	public String message;

	public void set(String message) {
		this.message = message;
	}

}
