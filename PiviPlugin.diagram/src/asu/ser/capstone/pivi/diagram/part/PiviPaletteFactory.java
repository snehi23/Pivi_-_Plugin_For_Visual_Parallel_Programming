
package asu.ser.capstone.pivi.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import asu.ser.capstone.pivi.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "nodes" palette tool group
	* @generated
	*/
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Nodes1Group_title);
		paletteContainer.setId("createNodes1Group"); //$NON-NLS-1$
		paletteContainer.add(createIfEndStatement1CreationTool());
		paletteContainer.add(createIfStartStatement2CreationTool());
		paletteContainer.add(createInstruction3CreationTool());
		paletteContainer.add(createResult4CreationTool());
		paletteContainer.add(createStart5CreationTool());
		paletteContainer.add(createWhileStatement6CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createOutputPortResult1CreationTool());
		paletteContainer.add(createTerminalInputPorts2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createIfEndStatement1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IfEndStatement1CreationTool_title,
				Messages.IfEndStatement1CreationTool_desc,
				Collections.singletonList(PiviElementTypes.IfEndStatement_2001));
		entry.setId("createIfEndStatement1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.IfEndStatement_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createIfStartStatement2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.IfStartStatement2CreationTool_title,
				Messages.IfStartStatement2CreationTool_desc,
				Collections.singletonList(PiviElementTypes.IfStartStatement_2004));
		entry.setId("createIfStartStatement2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.IfStartStatement_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInstruction3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Instruction3CreationTool_title,
				Messages.Instruction3CreationTool_desc, Collections.singletonList(PiviElementTypes.Instruction_2003));
		entry.setId("createInstruction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.Instruction_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createResult4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Result4CreationTool_title, Messages.Result4CreationTool_desc, null,
				null) {
		};
		entry.setId("createResult4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStart5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Start5CreationTool_title,
				Messages.Start5CreationTool_desc, Collections.singletonList(PiviElementTypes.Start_2002));
		entry.setId("createStart5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.Start_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createWhileStatement6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.WhileStatement6CreationTool_title,
				Messages.WhileStatement6CreationTool_desc,
				Collections.singletonList(PiviElementTypes.WhileStatement_2005));
		entry.setId("createWhileStatement6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.WhileStatement_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputPortResult1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.OutputPortResult1CreationTool_title,
				Messages.OutputPortResult1CreationTool_desc,
				Collections.singletonList(PiviElementTypes.OutputPortResult_4002));
		entry.setId("createOutputPortResult1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.OutputPortResult_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTerminalInputPorts2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.TerminalInputPorts2CreationTool_title,
				Messages.TerminalInputPorts2CreationTool_desc,
				Collections.singletonList(PiviElementTypes.TerminalInputPorts_4001));
		entry.setId("createTerminalInputPorts2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.TerminalInputPorts_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
