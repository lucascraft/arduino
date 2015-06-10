/**
 * Generated with Acceleo
 */
package net.sf.smbt.mdl.arduino.parts.impl;

// Start of user code for imports
import net.sf.smbt.mdl.arduino.parts.ArduinoViewsRepository;
import net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart;

import net.sf.smbt.mdl.arduino.providers.ArduinoMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.impl.parts.CompositePropertiesEditionPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.SWTUtils;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.swt.SWT;

import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;

import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

// End of user code

/**
 * 
 * 
 */
public class PortPropertiesEditionPartImpl extends CompositePropertiesEditionPart implements ISWTPropertiesEditionPart, PortPropertiesEditionPart {

	protected EMFComboViewer map;
	protected EMFComboViewer report;
	protected Text channel;
	protected Text name;



	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public PortPropertiesEditionPartImpl(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createFigure(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public Composite createFigure(final Composite parent) {
		view = new Composite(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(view);
		return view;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.ISWTPropertiesEditionPart#
	 * 			createControls(org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(Composite view) { 
		CompositionSequence portStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = portStep.addStep(ArduinoViewsRepository.Port.Properties.class);
		propertiesStep.addStep(ArduinoViewsRepository.Port.Properties.map);
		propertiesStep.addStep(ArduinoViewsRepository.Port.Properties.report);
		propertiesStep.addStep(ArduinoViewsRepository.Port.Properties.channel);
		propertiesStep.addStep(ArduinoViewsRepository.Port.Properties.name);
		
		
		composer = new PartComposer(portStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArduinoViewsRepository.Port.Properties.class) {
					return createPropertiesGroup(parent);
				}
				if (key == ArduinoViewsRepository.Port.Properties.map) {
					return createMapEMFComboViewer(parent);
				}
				if (key == ArduinoViewsRepository.Port.Properties.report) {
					return createReportEMFComboViewer(parent);
				}
				if (key == ArduinoViewsRepository.Port.Properties.channel) {
					return createChannelText(parent);
				}
				if (key == ArduinoViewsRepository.Port.Properties.name) {
					return createNameText(parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}

	/**
	 * 
	 */
	protected Composite createPropertiesGroup(Composite parent) {
		Group propertiesGroup = new Group(parent, SWT.NONE);
		propertiesGroup.setText(ArduinoMessages.PortPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesGroupData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesGroupData.horizontalSpan = 3;
		propertiesGroup.setLayoutData(propertiesGroupData);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		return propertiesGroup;
	}

	
	protected Composite createMapEMFComboViewer(Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Port.Properties.map, ArduinoMessages.PortPropertiesEditionPart_MapLabel);
		map = new EMFComboViewer(parent);
		map.setContentProvider(new ArrayContentProvider());
		map.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData mapData = new GridData(GridData.FILL_HORIZONTAL);
		map.getCombo().setLayoutData(mapData);
		map.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartImpl.this, ArduinoViewsRepository.Port.Properties.map, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMap()));
			}

		});
		map.setID(ArduinoViewsRepository.Port.Properties.map);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Port.Properties.map, ArduinoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createMapEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createReportEMFComboViewer(Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Port.Properties.report, ArduinoMessages.PortPropertiesEditionPart_ReportLabel);
		report = new EMFComboViewer(parent);
		report.setContentProvider(new ArrayContentProvider());
		report.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData reportData = new GridData(GridData.FILL_HORIZONTAL);
		report.getCombo().setLayoutData(reportData);
		report.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartImpl.this, ArduinoViewsRepository.Port.Properties.report, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReport()));
			}

		});
		report.setID(ArduinoViewsRepository.Port.Properties.report);
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Port.Properties.report, ArduinoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createReportEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createChannelText(Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Port.Properties.channel, ArduinoMessages.PortPropertiesEditionPart_ChannelLabel);
		channel = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData channelData = new GridData(GridData.FILL_HORIZONTAL);
		channel.setLayoutData(channelData);
		channel.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartImpl.this, ArduinoViewsRepository.Port.Properties.channel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, channel.getText()));
			}

		});
		channel.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartImpl.this, ArduinoViewsRepository.Port.Properties.channel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, channel.getText()));
				}
			}

		});
		EditingUtils.setID(channel, ArduinoViewsRepository.Port.Properties.channel);
		EditingUtils.setEEFtype(channel, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Port.Properties.channel, ArduinoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createChannelText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Port.Properties.name, ArduinoMessages.PortPropertiesEditionPart_NameLabel);
		name = SWTUtils.createScrollableText(parent, SWT.BORDER);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartImpl.this, ArduinoViewsRepository.Port.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
			}

		});
		name.addKeyListener(new KeyAdapter() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(PortPropertiesEditionPartImpl.this, ArduinoViewsRepository.Port.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}

		});
		EditingUtils.setID(name, ArduinoViewsRepository.Port.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		SWTUtils.createHelpButton(parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Port.Properties.name, ArduinoViewsRepository.SWT_KIND), null); //$NON-NLS-1$
		// Start of user code for createNameText

		// End of user code
		return parent;
	}


	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionListener#firePropertiesChanged(org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent)
	 * 
	 */
	public void firePropertiesChanged(IPropertiesEditionEvent event) {
		// Start of user code for tab synchronization
		
		// End of user code
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#getMap()
	 * 
	 */
	public Enumerator getMap() {
		Enumerator selection = (Enumerator) ((StructuredSelection) map.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#initMap(Object input, Enumerator current)
	 */
	public void initMap(Object input, Enumerator current) {
		map.setInput(input);
		map.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Port.Properties.map);
		if (eefElementEditorReadOnlyState && map.isEnabled()) {
			map.setEnabled(false);
			map.setToolTipText(ArduinoMessages.Port_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !map.isEnabled()) {
			map.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#setMap(Enumerator newValue)
	 * 
	 */
	public void setMap(Enumerator newValue) {
		map.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Port.Properties.map);
		if (eefElementEditorReadOnlyState && map.isEnabled()) {
			map.setEnabled(false);
			map.setToolTipText(ArduinoMessages.Port_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !map.isEnabled()) {
			map.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#getReport()
	 * 
	 */
	public Enumerator getReport() {
		Enumerator selection = (Enumerator) ((StructuredSelection) report.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#initReport(Object input, Enumerator current)
	 */
	public void initReport(Object input, Enumerator current) {
		report.setInput(input);
		report.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Port.Properties.report);
		if (eefElementEditorReadOnlyState && report.isEnabled()) {
			report.setEnabled(false);
			report.setToolTipText(ArduinoMessages.Port_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !report.isEnabled()) {
			report.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#setReport(Enumerator newValue)
	 * 
	 */
	public void setReport(Enumerator newValue) {
		report.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Port.Properties.report);
		if (eefElementEditorReadOnlyState && report.isEnabled()) {
			report.setEnabled(false);
			report.setToolTipText(ArduinoMessages.Port_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !report.isEnabled()) {
			report.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#getChannel()
	 * 
	 */
	public String getChannel() {
		return channel.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#setChannel(String newValue)
	 * 
	 */
	public void setChannel(String newValue) {
		if (newValue != null) {
			channel.setText(newValue);
		} else {
			channel.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Port.Properties.channel);
		if (eefElementEditorReadOnlyState && channel.isEnabled()) {
			channel.setEnabled(false);
			channel.setToolTipText(ArduinoMessages.Port_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !channel.isEnabled()) {
			channel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.PortPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Port.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ArduinoMessages.Port_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !name.isEnabled()) {
			name.setEnabled(true);
		}	
		
	}






	/**
	 * {@inheritDoc}
	 *
	 * @see org.eclipse.emf.eef.runtime.api.parts.IPropertiesEditionPart#getTitle()
	 * 
	 */
	public String getTitle() {
		return ArduinoMessages.Port_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
