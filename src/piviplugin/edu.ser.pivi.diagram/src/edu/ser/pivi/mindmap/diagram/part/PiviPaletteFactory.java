
package edu.ser.pivi.mindmap.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

import edu.ser.pivi.mindmap.diagram.providers.PiviElementTypes;

/**
 * @generated
 */
public class PiviPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createMindmap1Group());
	}

	/**
	* Creates "mindmap" palette tool group
	* @generated
	*/
	private PaletteContainer createMindmap1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Mindmap1Group_title);
		paletteContainer.setId("createMindmap1Group"); //$NON-NLS-1$
		paletteContainer.add(createStart1CreationTool());
		paletteContainer.add(createStartConnector2CreationTool());
		paletteContainer.add(createEnd3CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createStart1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.Start1CreationTool_title,
				Messages.Start1CreationTool_desc, Collections.singletonList(PiviElementTypes.End_2001));
		entry.setId("createStart1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.End_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createStartConnector2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(Messages.StartConnector2CreationTool_title,
				Messages.StartConnector2CreationTool_desc, Collections.singletonList(PiviElementTypes.Start_2002));
		entry.setId("createStartConnector2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.Start_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createEnd3CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(Messages.End3CreationTool_title,
				Messages.End3CreationTool_desc, Collections.singletonList(PiviElementTypes.StartConnector_4001));
		entry.setId("createEnd3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(PiviElementTypes.getImageDescriptor(PiviElementTypes.StartConnector_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
