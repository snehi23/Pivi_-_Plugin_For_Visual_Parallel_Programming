
package asu.edu.ser.capstone.pivi.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import asu.edu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createPivinodes1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "pivi nodes" palette tool group
	* @generated
	*/
	private PaletteContainer createPivinodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Pivinodes1Group_title);
		paletteContainer.setId("createPivinodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createEndNode1CreationTool());
		paletteContainer.add(createIfEnd2CreationTool());
		paletteContainer.add(createIfStart3CreationTool());
		paletteContainer.add(createInputPort4CreationTool());
		paletteContainer.add(createInstruction5CreationTool());
		paletteContainer.add(createOutputPort6CreationTool());
		paletteContainer.add(createStartNode7CreationTool());
		paletteContainer.add(createWhileStart8CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createEdge1CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createEndNode1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.EndNode1CreationTool_title,
				Messages.EndNode1CreationTool_desc, Collections.singletonList(PiviElementTypes.EndNode_2002));
		entry.setId("createEndNode1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.EndNode_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIfEnd2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IfEnd2CreationTool_title,
				Messages.IfEnd2CreationTool_desc, Collections.singletonList(PiviElementTypes.IfEnd_2005));
		entry.setId("createIfEnd2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.IfEnd_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIfStart3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IfStart3CreationTool_title,
				Messages.IfStart3CreationTool_desc, Collections.singletonList(PiviElementTypes.IfStart_2003));
		entry.setId("createIfStart3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.IfStart_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputPort4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.InputPort4CreationTool_title,
				Messages.InputPort4CreationTool_desc, Collections.singletonList(PiviElementTypes.InputPort_3001));
		entry.setId("createInputPort4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.InputPort_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInstruction5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Instruction5CreationTool_title,
				Messages.Instruction5CreationTool_desc, Collections.singletonList(PiviElementTypes.Instruction_2004));
		entry.setId("createInstruction5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.Instruction_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputPort6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.OutputPort6CreationTool_title,
				Messages.OutputPort6CreationTool_desc, Collections.singletonList(PiviElementTypes.OutputPort_3002));
		entry.setId("createOutputPort6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.OutputPort_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStartNode7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StartNode7CreationTool_title,
				Messages.StartNode7CreationTool_desc, Collections.singletonList(PiviElementTypes.StartNode_2006));
		entry.setId("createStartNode7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.StartNode_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWhileStart8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.WhileStart8CreationTool_title,
				Messages.WhileStart8CreationTool_desc, Collections.singletonList(PiviElementTypes.WhileStart_2001));
		entry.setId("createWhileStart8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.WhileStart_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEdge1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.Edge1CreationTool_title,
				Messages.Edge1CreationTool_desc, Collections.singletonList(PiviElementTypes.Edge_4001));
		entry.setId("createEdge1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.Edge_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
