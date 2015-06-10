package net.sf.smbt.arduino.edit.custom;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class AddArduinoUnoCommand extends AddCommand {
	public AddArduinoUnoCommand(EditingDomain domain, EObject owner,
			EStructuralFeature feature, Object value, int index) {
		super(domain, owner, feature, value, index);
	}
	

	@Override
	public Command chain(Command command) {
		// TODO Auto-generated method stub
		return super.chain(command);
	}
	
	@Override
	public void doExecute() {
		// TODO Auto-generated method stub
		super.doExecute();
	}
	
	@Override
	protected boolean prepare() {
		// TODO Auto-generated method stub
		return super.prepare();
	}
	
	
}
