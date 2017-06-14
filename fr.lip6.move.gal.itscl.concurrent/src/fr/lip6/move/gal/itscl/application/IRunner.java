package fr.lip6.move.gal.itscl.application;

import java.io.IOException;
import java.util.Set;

import fr.lip6.move.gal.Specification;

public interface IRunner {

	public void configure(Specification z3Spec, Set<String> doneProps) throws IOException;

	public void solve();

	public Specification getSpec();

	public Set<String> doneProps();

	public Boolean taskDone();

}
