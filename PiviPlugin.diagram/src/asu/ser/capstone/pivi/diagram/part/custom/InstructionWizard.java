package asu.ser.capstone.pivi.diagram.part.custom;

import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class InstructionWizard extends Wizard {

	private class InstructionPage extends WizardPage {

		public Text instructionText;

		public InstructionPage(String pageName) {
			super(pageName);
			setTitle("Rename");
			setDescription("Rename a component");
		}

		@Override
		public void createControl(Composite parent) {
			Composite composite = new Composite(parent, SWT.NONE);
			Label lab = new Label(composite, SWT.NONE);
			lab.setText("Rename to: ");
			instructionText = new Text(composite, SWT.NONE);
			instructionText.setText(oldInstructions);
			RowLayout rl = new RowLayout();
			composite.setLayout(rl);
			setControl(composite);
		}
	}

	private String oldInstructions;
	private String newInstructions;

	public InstructionWizard(String oldName) {
		this.oldInstructions = oldName;
		this.newInstructions = null;
		addPage(new InstructionPage("MyRenamePage"));
	}

	@Override
	public boolean performFinish() {
		InstructionPage page = (InstructionPage) getPage("MyRenamePage");
		if (page.instructionText.getText().isEmpty()) {
			page.setErrorMessage("Le champ nom est vide!");
			return false;
		}
		newInstructions = page.instructionText.getText();
		return true;
	}

	public String getNewInstructions() {
		return newInstructions;
	}
}
