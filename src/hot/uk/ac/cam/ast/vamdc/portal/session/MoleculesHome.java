package uk.ac.cam.ast.vamdc.portal.session;

import uk.ac.cam.ast.vamdc.portal.entity.*;
import org.jboss.seam.annotations.Name;
import org.jboss.seam.framework.EntityHome;

@Name("moleculesHome")
public class MoleculesHome extends EntityHome<Molecules> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3774409357664814644L;

	public void setMoleculesId(Integer id) {
		setId(id);
	}

	public Integer getMoleculesId() {
		return (Integer) getId();
	}

	@Override
	protected Molecules createInstance() {
		Molecules molecules = new Molecules();
		return molecules;
	}

	public void load() {
		if (isIdDefined()) {
			wire();
		}
	}

	public void wire() {
		getInstance();
	}

	public boolean isWired() {
		return true;
	}

	public Molecules getDefinedInstance() {
		return isIdDefined() ? getInstance() : null;
	}

}
