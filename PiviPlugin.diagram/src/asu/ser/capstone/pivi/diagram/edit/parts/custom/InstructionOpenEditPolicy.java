package asu.ser.capstone.pivi.diagram.edit.parts.custom;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.OpenEditPolicy;
import org.eclipse.jface.window.Window;
import org.eclipse.jface.wizard.IWizard;
import org.eclipse.jface.wizard.WizardDialog;

import asu.ser.capstone.pivi.diagram.edit.parts.InstructionInstructionFigureCompartmentEditPart;
import asu.ser.capstone.pivi.diagram.part.custom.InstructionWizard;

public class InstructionOpenEditPolicy extends OpenEditPolicy {

	private WizardDialog wizardDialog;
	private int instructionKey;
	public static Map<Integer, String> instructionsMap = new HashMap<>();

	public InstructionOpenEditPolicy(WizardDialog wizardDialog, String elementGuid) {
		super();
		this.wizardDialog = wizardDialog;
		this.instructionKey = Integer.parseInt(elementGuid.substring(elementGuid.indexOf(".") + 1, elementGuid.length()));
	}

	@Override
	protected Command getOpenCommand(Request request) {

		if (wizardDialog.open() == Window.OK) {
			IWizard wizard = wizardDialog.getCurrentPage().getWizard();
			if (wizard instanceof InstructionWizard) {
				EditPart editPart = getTargetEditPart(request);
				if (editPart != null && editPart instanceof InstructionInstructionFigureCompartmentEditPart) {
					String instructionData = ((InstructionWizard) wizard).getNewInstructions();
					instructionsMap.put(this.instructionKey, instructionData);
				}
			}
		}
		return null;
	}

}
