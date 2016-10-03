package com.formation.TestJSF.listeners;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class EcouteurPhase implements PhaseListener {
	
	private static final long serialVersionUID = 1L;
	
	// m�thode appell�e par JSF apr�s une des 6 phases JSF
	public void afterPhase (PhaseEvent event) {
		System.out.println("Phase apr�s : " + event.getPhaseId().toString());
	}
	
	// m�thode appel�e par JSF avant une des 6 phases JSF
	public void beforePhase (PhaseEvent event) {
		System.out.println("Phase avant : " + event.getPhaseId().toString());
	}
	
	public PhaseId getPhaseId() {
		return PhaseId.ANY_PHASE;
	}

}
