/**
 * Generated with Acceleo
 */
package net.sf.smbt.mdl.arduino.parts.forms;

// Start of user code for imports
import net.sf.smbt.mdl.arduino.parts.ArduinoViewsRepository;
import net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart;

import net.sf.smbt.mdl.arduino.providers.ArduinoMessages;

import org.eclipse.emf.common.util.Enumerator;

import org.eclipse.emf.ecore.util.EcoreAdapterFactory;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;

import org.eclipse.emf.eef.runtime.EEFRuntimePlugin;

import org.eclipse.emf.eef.runtime.api.component.IPropertiesEditionComponent;

import org.eclipse.emf.eef.runtime.api.notify.IPropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart;

import org.eclipse.emf.eef.runtime.impl.notify.PropertiesEditionEvent;

import org.eclipse.emf.eef.runtime.part.impl.SectionPropertiesEditingPart;

import org.eclipse.emf.eef.runtime.ui.parts.PartComposer;

import org.eclipse.emf.eef.runtime.ui.parts.sequence.BindingCompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionSequence;
import org.eclipse.emf.eef.runtime.ui.parts.sequence.CompositionStep;

import org.eclipse.emf.eef.runtime.ui.utils.EditingUtils;

import org.eclipse.emf.eef.runtime.ui.widgets.EMFComboViewer;
import org.eclipse.emf.eef.runtime.ui.widgets.FormUtils;

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
import org.eclipse.swt.widgets.Text;

import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;

// End of user code

/**
 * 
 * 
 */
public class TxPortPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, TxPortPropertiesEditionPart {

	protected EMFComboViewer map;
	protected EMFComboViewer report;
	protected Text channel;
	protected Text name;



	/**
	 * For {@link ISection} use only.
	 */
	public TxPortPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public TxPortPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
		super(editionComponent);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createFigure(org.eclipse.swt.widgets.Composite, org.eclipse.ui.forms.widgets.FormToolkit)
	 * 
	 */
	public Composite createFigure(final Composite parent, final FormToolkit widgetFactory) {
		ScrolledForm scrolledForm = widgetFactory.createScrolledForm(parent);
		Form form = scrolledForm.getForm();
		view = form.getBody();
		GridLayout layout = new GridLayout();
		layout.numColumns = 3;
		view.setLayout(layout);
		createControls(widgetFactory, view);
		return scrolledForm;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see org.eclipse.emf.eef.runtime.api.parts.IFormPropertiesEditionPart#
	 *  createControls(org.eclipse.ui.forms.widgets.FormToolkit, org.eclipse.swt.widgets.Composite)
	 * 
	 */
	public void createControls(final FormToolkit widgetFactory, Composite view) {
		CompositionSequence txPortStep = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = txPortStep.addStep(ArduinoViewsRepository.TxPort.Properties.class);
		propertiesStep.addStep(ArduinoViewsRepository.TxPort.Properties.map);
		propertiesStep.addStep(ArduinoViewsRepository.TxPort.Properties.report);
		propertiesStep.addStep(ArduinoViewsRepository.TxPort.Properties.channel);
		propertiesStep.addStep(ArduinoViewsRepository.TxPort.Properties.name);
		
		
		composer = new PartComposer(txPortStep) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArduinoViewsRepository.TxPort.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.TxPort.Properties.map) {
					return createMapEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.TxPort.Properties.report) {
					return createReportEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.TxPort.Properties.channel) {
					return createChannelText(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.TxPort.Properties.name) {
					return createNameText(widgetFactory, parent);
				}
				return parent;
			}
		};
		composer.compose(view);
	}
	/**
	 * 
	 */
	protected Composite createPropertiesGroup(FormToolkit widgetFactory, final Composite parent) {
		Section propertiesSection = widgetFactory.createSection(parent, Section.TITLE_BAR | Section.TWISTIE | Section.EXPANDED);
		propertiesSection.setText(ArduinoMessages.TxPortPropertiesEditionPart_PropertiesGroupLabel);
		GridData propertiesSectionData = new GridData(GridData.FILL_HORIZONTAL);
		propertiesSectionData.horizontalSpan = 3;
		propertiesSection.setLayoutData(propertiesSectionData);
		Composite propertiesGroup = widgetFactory.createComposite(propertiesSection);
		GridLayout propertiesGroupLayout = new GridLayout();
		propertiesGroupLayout.numColumns = 3;
		propertiesGroup.setLayout(propertiesGroupLayout);
		propertiesSection.setClient(propertiesGroup);
		return propertiesGroup;
	}

	
	protected Composite createMapEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.TxPort.Properties.map, ArduinoMessages.TxPortPropertiesEditionPart_MapLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TxPortPropertiesEditionPartForm.this, ArduinoViewsRepository.TxPort.Properties.map, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getMap()));
			}

		});
		map.setID(ArduinoViewsRepository.TxPort.Properties.map);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.TxPort.Properties.map, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createMapEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createReportEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.TxPort.Properties.report, ArduinoMessages.TxPortPropertiesEditionPart_ReportLabel);
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
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TxPortPropertiesEditionPartForm.this, ArduinoViewsRepository.TxPort.Properties.report, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getReport()));
			}

		});
		report.setID(ArduinoViewsRepository.TxPort.Properties.report);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.TxPort.Properties.report, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createReportEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createChannelText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.TxPort.Properties.channel, ArduinoMessages.TxPortPropertiesEditionPart_ChannelLabel);
		channel = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		channel.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData channelData = new GridData(GridData.FILL_HORIZONTAL);
		channel.setLayoutData(channelData);
		channel.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TxPortPropertiesEditionPartForm.this,
							ArduinoViewsRepository.TxPort.Properties.channel,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, channel.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TxPortPropertiesEditionPartForm.this,
									ArduinoViewsRepository.TxPort.Properties.channel,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, channel.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TxPortPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		channel.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TxPortPropertiesEditionPartForm.this, ArduinoViewsRepository.TxPort.Properties.channel, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, channel.getText()));
				}
			}
		});
		EditingUtils.setID(channel, ArduinoViewsRepository.TxPort.Properties.channel);
		EditingUtils.setEEFtype(channel, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.TxPort.Properties.channel, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createChannelText

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.TxPort.Properties.name, ArduinoMessages.TxPortPropertiesEditionPart_NameLabel);
		name = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		name.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData nameData = new GridData(GridData.FILL_HORIZONTAL);
		name.setLayoutData(nameData);
		name.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							TxPortPropertiesEditionPartForm.this,
							ArduinoViewsRepository.TxPort.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TxPortPropertiesEditionPartForm.this,
									ArduinoViewsRepository.TxPort.Properties.name,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, name.getText()));
				}
			}

			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusGained(org.eclipse.swt.events.FocusEvent)
			 */
			@Override
			public void focusGained(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									TxPortPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		name.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(TxPortPropertiesEditionPartForm.this, ArduinoViewsRepository.TxPort.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ArduinoViewsRepository.TxPort.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.TxPort.Properties.name, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#getMap()
	 * 
	 */
	public Enumerator getMap() {
		Enumerator selection = (Enumerator) ((StructuredSelection) map.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#initMap(Object input, Enumerator current)
	 */
	public void initMap(Object input, Enumerator current) {
		map.setInput(input);
		map.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.TxPort.Properties.map);
		if (eefElementEditorReadOnlyState && map.isEnabled()) {
			map.setEnabled(false);
			map.setToolTipText(ArduinoMessages.TxPort_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !map.isEnabled()) {
			map.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#setMap(Enumerator newValue)
	 * 
	 */
	public void setMap(Enumerator newValue) {
		map.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.TxPort.Properties.map);
		if (eefElementEditorReadOnlyState && map.isEnabled()) {
			map.setEnabled(false);
			map.setToolTipText(ArduinoMessages.TxPort_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !map.isEnabled()) {
			map.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#getReport()
	 * 
	 */
	public Enumerator getReport() {
		Enumerator selection = (Enumerator) ((StructuredSelection) report.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#initReport(Object input, Enumerator current)
	 */
	public void initReport(Object input, Enumerator current) {
		report.setInput(input);
		report.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.TxPort.Properties.report);
		if (eefElementEditorReadOnlyState && report.isEnabled()) {
			report.setEnabled(false);
			report.setToolTipText(ArduinoMessages.TxPort_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !report.isEnabled()) {
			report.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#setReport(Enumerator newValue)
	 * 
	 */
	public void setReport(Enumerator newValue) {
		report.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.TxPort.Properties.report);
		if (eefElementEditorReadOnlyState && report.isEnabled()) {
			report.setEnabled(false);
			report.setToolTipText(ArduinoMessages.TxPort_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !report.isEnabled()) {
			report.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#getChannel()
	 * 
	 */
	public String getChannel() {
		return channel.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#setChannel(String newValue)
	 * 
	 */
	public void setChannel(String newValue) {
		if (newValue != null) {
			channel.setText(newValue);
		} else {
			channel.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.TxPort.Properties.channel);
		if (eefElementEditorReadOnlyState && channel.isEnabled()) {
			channel.setEnabled(false);
			channel.setToolTipText(ArduinoMessages.TxPort_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !channel.isEnabled()) {
			channel.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.TxPortPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.TxPort.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ArduinoMessages.TxPort_ReadOnly);
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
		return ArduinoMessages.TxPort_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
