/**
 * Generated with Acceleo
 */
package net.sf.smbt.mdl.arduino.parts;

// Start of user code for imports
import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;

import org.eclipse.jface.viewers.ViewerFilter;


// End of user code

/**
 * 
 * 
 */
public interface ArduinoPropertiesEditionPart {

	/**
	 * @return the ver
	 * 
	 */
	public Enumerator getVer();

	/**
	 * Init the ver
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initVer(Object input, Enumerator current);

	/**
	 * Defines a new ver
	 * @param newValue the new ver to set
	 * 
	 */
	public void setVer(Enumerator newValue);


	/**
	 * @return the board
	 * 
	 */
	public Enumerator getBoard();

	/**
	 * Init the board
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initBoard(Object input, Enumerator current);

	/**
	 * Defines a new board
	 * @param newValue the new board to set
	 * 
	 */
	public void setBoard(Enumerator newValue);


	/**
	 * @return the series
	 * 
	 */
	public Enumerator getSeries();

	/**
	 * Init the series
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initSeries(Object input, Enumerator current);

	/**
	 * Defines a new series
	 * @param newValue the new series to set
	 * 
	 */
	public void setSeries(Enumerator newValue);




	/**
	 * Init the digitalPorts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initDigitalPorts(ReferencesTableSettings settings);

	/**
	 * Update the digitalPorts
	 * @param newValue the digitalPorts to update
	 * 
	 */
	public void updateDigitalPorts();

	/**
	 * Adds the given filter to the digitalPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToDigitalPorts(ViewerFilter filter);

	/**
	 * Adds the given filter to the digitalPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToDigitalPorts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the digitalPorts table
	 * 
	 */
	public boolean isContainedInDigitalPortsTable(EObject element);




	/**
	 * Init the analogPorts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initAnalogPorts(ReferencesTableSettings settings);

	/**
	 * Update the analogPorts
	 * @param newValue the analogPorts to update
	 * 
	 */
	public void updateAnalogPorts();

	/**
	 * Adds the given filter to the analogPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToAnalogPorts(ViewerFilter filter);

	/**
	 * Adds the given filter to the analogPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToAnalogPorts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the analogPorts table
	 * 
	 */
	public boolean isContainedInAnalogPortsTable(EObject element);




	/**
	 * Init the groundPorts
	 * @param current the current value
	 * @param containgFeature the feature where to navigate if necessary
	 * @param feature the feature to manage
	 */
	public void initGroundPorts(ReferencesTableSettings settings);

	/**
	 * Update the groundPorts
	 * @param newValue the groundPorts to update
	 * 
	 */
	public void updateGroundPorts();

	/**
	 * Adds the given filter to the groundPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addFilterToGroundPorts(ViewerFilter filter);

	/**
	 * Adds the given filter to the groundPorts edition editor.
	 * 
	 * @param filter
	 *            a viewer filter
	 * @see org.eclipse.jface.viewers.StructuredViewer#addFilter(ViewerFilter)
	 * 
	 */
	public void addBusinessFilterToGroundPorts(ViewerFilter filter);

	/**
	 * @return true if the given element is contained inside the groundPorts table
	 * 
	 */
	public boolean isContainedInGroundPortsTable(EObject element);


	/**
	 * @return the label
	 * 
	 */
	public String getLabel();

	/**
	 * Defines a new label
	 * @param newValue the new label to set
	 * 
	 */
	public void setLabel(String newValue);


	/**
	 * @return the comm
	 * 
	 */
	public Enumerator getComm();

	/**
	 * Init the comm
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initComm(Object input, Enumerator current);

	/**
	 * Defines a new comm
	 * @param newValue the new comm to set
	 * 
	 */
	public void setComm(Enumerator newValue);


	/**
	 * @return the firmataMode
	 * 
	 */
	public Enumerator getFirmataMode();

	/**
	 * Init the firmataMode
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initFirmataMode(Object input, Enumerator current);

	/**
	 * Defines a new firmataMode
	 * @param newValue the new firmataMode to set
	 * 
	 */
	public void setFirmataMode(Enumerator newValue);


	/**
	 * @return the lockedPin
	 * 
	 */
	public Enumerator getLockedPin();

	/**
	 * Init the lockedPin
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initLockedPin(Object input, Enumerator current);

	/**
	 * Defines a new lockedPin
	 * @param newValue the new lockedPin to set
	 * 
	 */
	public void setLockedPin(Enumerator newValue);


	/**
	 * @return the synchronizing
	 * 
	 */
	public Boolean getSynchronizing();

	/**
	 * Defines a new synchronizing
	 * @param newValue the new synchronizing to set
	 * 
	 */
	public void setSynchronizing(Boolean newValue);


	/**
	 * @return the status
	 * 
	 */
	public Enumerator getStatus();

	/**
	 * Init the status
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initStatus(Object input, Enumerator current);

	/**
	 * Defines a new status
	 * @param newValue the new status to set
	 * 
	 */
	public void setStatus(Enumerator newValue);


	/**
	 * @return the kind
	 * 
	 */
	public Enumerator getKind();

	/**
	 * Init the kind
	 * @param input the viewer input
	 * @param current the current value
	 */
	public void initKind(Object input, Enumerator current);

	/**
	 * Defines a new kind
	 * @param newValue the new kind to set
	 * 
	 */
	public void setKind(Enumerator newValue);


	/**
	 * @return the name
	 * 
	 */
	public String getName();

	/**
	 * Defines a new name
	 * @param newValue the new name to set
	 * 
	 */
	public void setName(String newValue);





	/**
	 * Returns the internationalized title text.
	 * 
	 * @return the internationalized title text.
	 * 
	 */
	public String getTitle();

	// Start of user code for additional methods
	
	// End of user code

}
