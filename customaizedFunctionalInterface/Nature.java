package customaizedFunctionalInterface;
@FunctionalInterface
public interface Nature<N> {
	void animals(N n);
	default void birds() {
		
	}

}
