/**
 * Generated with Acceleo
 */
package net.sf.smbt.mdl.arduino.parts.forms;

// Start of user code for imports
import java.util.ArrayList;
import java.util.List;

import net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart;
import net.sf.smbt.mdl.arduino.parts.ArduinoViewsRepository;
import net.sf.smbt.mdl.arduino.providers.ArduinoMessages;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable;
import org.eclipse.emf.eef.runtime.ui.widgets.ReferencesTable.ReferencesTableListener;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableContentProvider;
import org.eclipse.emf.eef.runtime.ui.widgets.referencestable.ReferencesTableSettings;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;

// End of user code

/**
 * 
 * 
 */
public class ArduinoPropertiesEditionPartForm extends SectionPropertiesEditingPart implements IFormPropertiesEditionPart, ArduinoPropertiesEditionPart {

	protected EMFComboViewer ver;
	protected EMFComboViewer board;
	protected EMFComboViewer series;
	protected ReferencesTable digitalPorts;
	protected List<ViewerFilter> digitalPortsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> digitalPortsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable analogPorts;
	protected List<ViewerFilter> analogPortsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> analogPortsFilters = new ArrayList<ViewerFilter>();
	protected ReferencesTable groundPorts;
	protected List<ViewerFilter> groundPortsBusinessFilters = new ArrayList<ViewerFilter>();
	protected List<ViewerFilter> groundPortsFilters = new ArrayList<ViewerFilter>();
	protected Text label;
	protected EMFComboViewer comm;
	protected EMFComboViewer firmataMode;
	protected EMFComboViewer lockedPin;
	protected Button synchronizing;
	protected EMFComboViewer status;
	protected EMFComboViewer kind;
	protected Text name;



	/**
	 * For {@link ISection} use only.
	 */
	public ArduinoPropertiesEditionPartForm() { super(); }

	/**
	 * Default constructor
	 * @param editionComponent the {@link IPropertiesEditionComponent} that manage this part
	 * 
	 */
	public ArduinoPropertiesEditionPartForm(IPropertiesEditionComponent editionComponent) {
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
		CompositionSequence arduino_Step = new BindingCompositionSequence(propertiesEditionComponent);
		CompositionStep propertiesStep = arduino_Step.addStep(ArduinoViewsRepository.Arduino_.Properties.class);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.ver);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.board);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.series);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.digitalPorts);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.analogPorts);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.groundPorts);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.label);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.comm);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.firmataMode);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.lockedPin);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.synchronizing);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.status);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.kind);
		propertiesStep.addStep(ArduinoViewsRepository.Arduino_.Properties.name);
		
		
		composer = new PartComposer(arduino_Step) {

			@Override
			public Composite addToPart(Composite parent, Object key) {
				if (key == ArduinoViewsRepository.Arduino_.Properties.class) {
					return createPropertiesGroup(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.ver) {
					return createVerEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.board) {
					return createBoardEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.series) {
					return createSeriesEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.digitalPorts) {
					return createDigitalPortsTableComposition(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.analogPorts) {
					return createAnalogPortsTableComposition(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.groundPorts) {
					return createGroundPortsTableComposition(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.label) {
					return createLabelText(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.comm) {
					return createCommEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.firmataMode) {
					return createFirmataModeEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.lockedPin) {
					return createLockedPinEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.synchronizing) {
					return createSynchronizingCheckbox(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.status) {
					return createStatusEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.kind) {
					return createKindEMFComboViewer(widgetFactory, parent);
				}
				if (key == ArduinoViewsRepository.Arduino_.Properties.name) {
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
		propertiesSection.setText(ArduinoMessages.ArduinoPropertiesEditionPart_PropertiesGroupLabel);
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

	
	protected Composite createVerEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.ver, ArduinoMessages.ArduinoPropertiesEditionPart_VerLabel);
		ver = new EMFComboViewer(parent);
		ver.setContentProvider(new ArrayContentProvider());
		ver.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData verData = new GridData(GridData.FILL_HORIZONTAL);
		ver.getCombo().setLayoutData(verData);
		ver.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.ver, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getVer()));
			}

		});
		ver.setID(ArduinoViewsRepository.Arduino_.Properties.ver);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.ver, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createVerEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createBoardEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.board, ArduinoMessages.ArduinoPropertiesEditionPart_BoardLabel);
		board = new EMFComboViewer(parent);
		board.setContentProvider(new ArrayContentProvider());
		board.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData boardData = new GridData(GridData.FILL_HORIZONTAL);
		board.getCombo().setLayoutData(boardData);
		board.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.board, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getBoard()));
			}

		});
		board.setID(ArduinoViewsRepository.Arduino_.Properties.board);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.board, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createBoardEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createSeriesEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.series, ArduinoMessages.ArduinoPropertiesEditionPart_SeriesLabel);
		series = new EMFComboViewer(parent);
		series.setContentProvider(new ArrayContentProvider());
		series.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData seriesData = new GridData(GridData.FILL_HORIZONTAL);
		series.getCombo().setLayoutData(seriesData);
		series.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.series, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getSeries()));
			}

		});
		series.setID(ArduinoViewsRepository.Arduino_.Properties.series);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.series, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSeriesEMFComboViewer

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createDigitalPortsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.digitalPorts = new ReferencesTable(getDescription(ArduinoViewsRepository.Arduino_.Properties.digitalPorts, ArduinoMessages.ArduinoPropertiesEditionPart_DigitalPortsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.digitalPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				digitalPorts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.digitalPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				digitalPorts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.digitalPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				digitalPorts.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.digitalPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				digitalPorts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.digitalPortsFilters) {
			this.digitalPorts.addFilter(filter);
		}
		this.digitalPorts.setHelpText(propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.digitalPorts, ArduinoViewsRepository.FORM_KIND));
		this.digitalPorts.createControls(parent, widgetFactory);
		this.digitalPorts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.digitalPorts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData digitalPortsData = new GridData(GridData.FILL_HORIZONTAL);
		digitalPortsData.horizontalSpan = 3;
		this.digitalPorts.setLayoutData(digitalPortsData);
		this.digitalPorts.setLowerBound(0);
		this.digitalPorts.setUpperBound(-1);
		digitalPorts.setID(ArduinoViewsRepository.Arduino_.Properties.digitalPorts);
		digitalPorts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createDigitalPortsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createAnalogPortsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.analogPorts = new ReferencesTable(getDescription(ArduinoViewsRepository.Arduino_.Properties.analogPorts, ArduinoMessages.ArduinoPropertiesEditionPart_AnalogPortsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.analogPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				analogPorts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.analogPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				analogPorts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.analogPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				analogPorts.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.analogPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				analogPorts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.analogPortsFilters) {
			this.analogPorts.addFilter(filter);
		}
		this.analogPorts.setHelpText(propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.analogPorts, ArduinoViewsRepository.FORM_KIND));
		this.analogPorts.createControls(parent, widgetFactory);
		this.analogPorts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.analogPorts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData analogPortsData = new GridData(GridData.FILL_HORIZONTAL);
		analogPortsData.horizontalSpan = 3;
		this.analogPorts.setLayoutData(analogPortsData);
		this.analogPorts.setLowerBound(0);
		this.analogPorts.setUpperBound(-1);
		analogPorts.setID(ArduinoViewsRepository.Arduino_.Properties.analogPorts);
		analogPorts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createAnalogPortsTableComposition

		// End of user code
		return parent;
	}

	/**
	 * @param container
	 * 
	 */
	protected Composite createGroundPortsTableComposition(FormToolkit widgetFactory, Composite parent) {
		this.groundPorts = new ReferencesTable(getDescription(ArduinoViewsRepository.Arduino_.Properties.groundPorts, ArduinoMessages.ArduinoPropertiesEditionPart_GroundPortsLabel), new ReferencesTableListener() {
			public void handleAdd() {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.groundPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.ADD, null, null));
				groundPorts.refresh();
			}
			public void handleEdit(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.groundPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.EDIT, null, element));
				groundPorts.refresh();
			}
			public void handleMove(EObject element, int oldIndex, int newIndex) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.groundPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.MOVE, element, newIndex));
				groundPorts.refresh();
			}
			public void handleRemove(EObject element) {
				propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.groundPorts, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.REMOVE, null, element));
				groundPorts.refresh();
			}
			public void navigateTo(EObject element) { }
		});
		for (ViewerFilter filter : this.groundPortsFilters) {
			this.groundPorts.addFilter(filter);
		}
		this.groundPorts.setHelpText(propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.groundPorts, ArduinoViewsRepository.FORM_KIND));
		this.groundPorts.createControls(parent, widgetFactory);
		this.groundPorts.addSelectionListener(new SelectionAdapter() {
			
			public void widgetSelected(SelectionEvent e) {
				if (e.item != null && e.item.getData() instanceof EObject) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.groundPorts, PropertiesEditionEvent.CHANGE, PropertiesEditionEvent.SELECTION_CHANGED, null, e.item.getData()));
				}
			}
			
		});
		GridData groundPortsData = new GridData(GridData.FILL_HORIZONTAL);
		groundPortsData.horizontalSpan = 3;
		this.groundPorts.setLayoutData(groundPortsData);
		this.groundPorts.setLowerBound(0);
		this.groundPorts.setUpperBound(-1);
		groundPorts.setID(ArduinoViewsRepository.Arduino_.Properties.groundPorts);
		groundPorts.setEEFType("eef::AdvancedTableComposition"); //$NON-NLS-1$
		// Start of user code for createGroundPortsTableComposition

		// End of user code
		return parent;
	}

	
	protected Composite createLabelText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.label, ArduinoMessages.ArduinoPropertiesEditionPart_LabelLabel);
		label = widgetFactory.createText(parent, ""); //$NON-NLS-1$
		label.setData(FormToolkit.KEY_DRAW_BORDER, FormToolkit.TEXT_BORDER);
		widgetFactory.paintBordersFor(parent);
		GridData labelData = new GridData(GridData.FILL_HORIZONTAL);
		label.setLayoutData(labelData);
		label.addFocusListener(new FocusAdapter() {
			/**
			 * @see org.eclipse.swt.events.FocusAdapter#focusLost(org.eclipse.swt.events.FocusEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void focusLost(FocusEvent e) {
				if (propertiesEditionComponent != null) {
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(
							ArduinoPropertiesEditionPartForm.this,
							ArduinoViewsRepository.Arduino_.Properties.label,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArduinoPropertiesEditionPartForm.this,
									ArduinoViewsRepository.Arduino_.Properties.label,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_LOST,
									null, label.getText()));
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
									ArduinoPropertiesEditionPartForm.this,
									null,
									PropertiesEditionEvent.FOCUS_CHANGED, PropertiesEditionEvent.FOCUS_GAINED,
									null, null));
				}
			}
		});
		label.addKeyListener(new KeyAdapter() {
			/**
			 * @see org.eclipse.swt.events.KeyAdapter#keyPressed(org.eclipse.swt.events.KeyEvent)
			 * 
			 */
			@Override
			@SuppressWarnings("synthetic-access")
			public void keyPressed(KeyEvent e) {
				if (e.character == SWT.CR) {
					if (propertiesEditionComponent != null)
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.label, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, label.getText()));
				}
			}
		});
		EditingUtils.setID(label, ArduinoViewsRepository.Arduino_.Properties.label);
		EditingUtils.setEEFtype(label, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.label, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLabelText

		// End of user code
		return parent;
	}

	
	protected Composite createCommEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.comm, ArduinoMessages.ArduinoPropertiesEditionPart_CommLabel);
		comm = new EMFComboViewer(parent);
		comm.setContentProvider(new ArrayContentProvider());
		comm.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData commData = new GridData(GridData.FILL_HORIZONTAL);
		comm.getCombo().setLayoutData(commData);
		comm.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.comm, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getComm()));
			}

		});
		comm.setID(ArduinoViewsRepository.Arduino_.Properties.comm);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.comm, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createCommEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createFirmataModeEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.firmataMode, ArduinoMessages.ArduinoPropertiesEditionPart_FirmataModeLabel);
		firmataMode = new EMFComboViewer(parent);
		firmataMode.setContentProvider(new ArrayContentProvider());
		firmataMode.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData firmataModeData = new GridData(GridData.FILL_HORIZONTAL);
		firmataMode.getCombo().setLayoutData(firmataModeData);
		firmataMode.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.firmataMode, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getFirmataMode()));
			}

		});
		firmataMode.setID(ArduinoViewsRepository.Arduino_.Properties.firmataMode);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.firmataMode, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createFirmataModeEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createLockedPinEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.lockedPin, ArduinoMessages.ArduinoPropertiesEditionPart_LockedPinLabel);
		lockedPin = new EMFComboViewer(parent);
		lockedPin.setContentProvider(new ArrayContentProvider());
		lockedPin.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData lockedPinData = new GridData(GridData.FILL_HORIZONTAL);
		lockedPin.getCombo().setLayoutData(lockedPinData);
		lockedPin.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.lockedPin, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getLockedPin()));
			}

		});
		lockedPin.setID(ArduinoViewsRepository.Arduino_.Properties.lockedPin);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.lockedPin, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createLockedPinEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createSynchronizingCheckbox(FormToolkit widgetFactory, Composite parent) {
		synchronizing = widgetFactory.createButton(parent, getDescription(ArduinoViewsRepository.Arduino_.Properties.synchronizing, ArduinoMessages.ArduinoPropertiesEditionPart_SynchronizingLabel), SWT.CHECK);
		synchronizing.addSelectionListener(new SelectionAdapter() {

			/**
			 * {@inheritDoc}
			 *
			 * @see org.eclipse.swt.events.SelectionAdapter#widgetSelected(org.eclipse.swt.events.SelectionEvent)
			 * 	
			 */
			public void widgetSelected(SelectionEvent e) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.synchronizing, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, new Boolean(synchronizing.getSelection())));
			}

		});
		GridData synchronizingData = new GridData(GridData.FILL_HORIZONTAL);
		synchronizingData.horizontalSpan = 2;
		synchronizing.setLayoutData(synchronizingData);
		EditingUtils.setID(synchronizing, ArduinoViewsRepository.Arduino_.Properties.synchronizing);
		EditingUtils.setEEFtype(synchronizing, "eef::Checkbox"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.synchronizing, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createSynchronizingCheckbox

		// End of user code
		return parent;
	}

	
	protected Composite createStatusEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.status, ArduinoMessages.ArduinoPropertiesEditionPart_StatusLabel);
		status = new EMFComboViewer(parent);
		status.setContentProvider(new ArrayContentProvider());
		status.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData statusData = new GridData(GridData.FILL_HORIZONTAL);
		status.getCombo().setLayoutData(statusData);
		status.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.status, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getStatus()));
			}

		});
		status.setID(ArduinoViewsRepository.Arduino_.Properties.status);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.status, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createStatusEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createKindEMFComboViewer(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.kind, ArduinoMessages.ArduinoPropertiesEditionPart_KindLabel);
		kind = new EMFComboViewer(parent);
		kind.setContentProvider(new ArrayContentProvider());
		kind.setLabelProvider(new AdapterFactoryLabelProvider(EEFRuntimePlugin.getDefault().getAdapterFactory()));
		GridData kindData = new GridData(GridData.FILL_HORIZONTAL);
		kind.getCombo().setLayoutData(kindData);
		kind.addSelectionChangedListener(new ISelectionChangedListener() {

			/**
			 * {@inheritDoc}
			 * 
			 * @see org.eclipse.jface.viewers.ISelectionChangedListener#selectionChanged(org.eclipse.jface.viewers.SelectionChangedEvent)
			 * 	
			 */
			public void selectionChanged(SelectionChangedEvent event) {
				if (propertiesEditionComponent != null)
					propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.kind, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, getKind()));
			}

		});
		kind.setID(ArduinoViewsRepository.Arduino_.Properties.kind);
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.kind, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
		// Start of user code for createKindEMFComboViewer

		// End of user code
		return parent;
	}

	
	protected Composite createNameText(FormToolkit widgetFactory, Composite parent) {
		createDescription(parent, ArduinoViewsRepository.Arduino_.Properties.name, ArduinoMessages.ArduinoPropertiesEditionPart_NameLabel);
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
							ArduinoPropertiesEditionPartForm.this,
							ArduinoViewsRepository.Arduino_.Properties.name,
							PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
					propertiesEditionComponent
							.firePropertiesChanged(new PropertiesEditionEvent(
									ArduinoPropertiesEditionPartForm.this,
									ArduinoViewsRepository.Arduino_.Properties.name,
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
									ArduinoPropertiesEditionPartForm.this,
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
						propertiesEditionComponent.firePropertiesChanged(new PropertiesEditionEvent(ArduinoPropertiesEditionPartForm.this, ArduinoViewsRepository.Arduino_.Properties.name, PropertiesEditionEvent.COMMIT, PropertiesEditionEvent.SET, null, name.getText()));
				}
			}
		});
		EditingUtils.setID(name, ArduinoViewsRepository.Arduino_.Properties.name);
		EditingUtils.setEEFtype(name, "eef::Text"); //$NON-NLS-1$
		FormUtils.createHelpButton(widgetFactory, parent, propertiesEditionComponent.getHelpContent(ArduinoViewsRepository.Arduino_.Properties.name, ArduinoViewsRepository.FORM_KIND), null); //$NON-NLS-1$
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
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getVer()
	 * 
	 */
	public Enumerator getVer() {
		Enumerator selection = (Enumerator) ((StructuredSelection) ver.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initVer(Object input, Enumerator current)
	 */
	public void initVer(Object input, Enumerator current) {
		ver.setInput(input);
		ver.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.ver);
		if (eefElementEditorReadOnlyState && ver.isEnabled()) {
			ver.setEnabled(false);
			ver.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ver.isEnabled()) {
			ver.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setVer(Enumerator newValue)
	 * 
	 */
	public void setVer(Enumerator newValue) {
		ver.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.ver);
		if (eefElementEditorReadOnlyState && ver.isEnabled()) {
			ver.setEnabled(false);
			ver.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !ver.isEnabled()) {
			ver.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getBoard()
	 * 
	 */
	public Enumerator getBoard() {
		Enumerator selection = (Enumerator) ((StructuredSelection) board.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initBoard(Object input, Enumerator current)
	 */
	public void initBoard(Object input, Enumerator current) {
		board.setInput(input);
		board.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.board);
		if (eefElementEditorReadOnlyState && board.isEnabled()) {
			board.setEnabled(false);
			board.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !board.isEnabled()) {
			board.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setBoard(Enumerator newValue)
	 * 
	 */
	public void setBoard(Enumerator newValue) {
		board.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.board);
		if (eefElementEditorReadOnlyState && board.isEnabled()) {
			board.setEnabled(false);
			board.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !board.isEnabled()) {
			board.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getSeries()
	 * 
	 */
	public Enumerator getSeries() {
		Enumerator selection = (Enumerator) ((StructuredSelection) series.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initSeries(Object input, Enumerator current)
	 */
	public void initSeries(Object input, Enumerator current) {
		series.setInput(input);
		series.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.series);
		if (eefElementEditorReadOnlyState && series.isEnabled()) {
			series.setEnabled(false);
			series.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !series.isEnabled()) {
			series.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setSeries(Enumerator newValue)
	 * 
	 */
	public void setSeries(Enumerator newValue) {
		series.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.series);
		if (eefElementEditorReadOnlyState && series.isEnabled()) {
			series.setEnabled(false);
			series.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !series.isEnabled()) {
			series.setEnabled(true);
		}	
		
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initDigitalPorts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initDigitalPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		digitalPorts.setContentProvider(contentProvider);
		digitalPorts.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.digitalPorts);
		if (eefElementEditorReadOnlyState && digitalPorts.isEnabled()) {
			digitalPorts.setEnabled(false);
			digitalPorts.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !digitalPorts.isEnabled()) {
			digitalPorts.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#updateDigitalPorts()
	 * 
	 */
	public void updateDigitalPorts() {
	digitalPorts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#addFilterDigitalPorts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToDigitalPorts(ViewerFilter filter) {
		digitalPortsFilters.add(filter);
		if (this.digitalPorts != null) {
			this.digitalPorts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#addBusinessFilterDigitalPorts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToDigitalPorts(ViewerFilter filter) {
		digitalPortsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#isContainedInDigitalPortsTable(EObject element)
	 * 
	 */
	public boolean isContainedInDigitalPortsTable(EObject element) {
		return ((ReferencesTableSettings)digitalPorts.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initAnalogPorts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initAnalogPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		analogPorts.setContentProvider(contentProvider);
		analogPorts.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.analogPorts);
		if (eefElementEditorReadOnlyState && analogPorts.isEnabled()) {
			analogPorts.setEnabled(false);
			analogPorts.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !analogPorts.isEnabled()) {
			analogPorts.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#updateAnalogPorts()
	 * 
	 */
	public void updateAnalogPorts() {
	analogPorts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#addFilterAnalogPorts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToAnalogPorts(ViewerFilter filter) {
		analogPortsFilters.add(filter);
		if (this.analogPorts != null) {
			this.analogPorts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#addBusinessFilterAnalogPorts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToAnalogPorts(ViewerFilter filter) {
		analogPortsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#isContainedInAnalogPortsTable(EObject element)
	 * 
	 */
	public boolean isContainedInAnalogPortsTable(EObject element) {
		return ((ReferencesTableSettings)analogPorts.getInput()).contains(element);
	}



	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initGroundPorts(EObject current, EReference containingFeature, EReference feature)
	 */
	public void initGroundPorts(ReferencesTableSettings settings) {
		if (current.eResource() != null && current.eResource().getResourceSet() != null)
			this.resourceSet = current.eResource().getResourceSet();
		ReferencesTableContentProvider contentProvider = new ReferencesTableContentProvider();
		groundPorts.setContentProvider(contentProvider);
		groundPorts.setInput(settings);
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.groundPorts);
		if (eefElementEditorReadOnlyState && groundPorts.isEnabled()) {
			groundPorts.setEnabled(false);
			groundPorts.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !groundPorts.isEnabled()) {
			groundPorts.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#updateGroundPorts()
	 * 
	 */
	public void updateGroundPorts() {
	groundPorts.refresh();
}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#addFilterGroundPorts(ViewerFilter filter)
	 * 
	 */
	public void addFilterToGroundPorts(ViewerFilter filter) {
		groundPortsFilters.add(filter);
		if (this.groundPorts != null) {
			this.groundPorts.addFilter(filter);
		}
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#addBusinessFilterGroundPorts(ViewerFilter filter)
	 * 
	 */
	public void addBusinessFilterToGroundPorts(ViewerFilter filter) {
		groundPortsBusinessFilters.add(filter);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#isContainedInGroundPortsTable(EObject element)
	 * 
	 */
	public boolean isContainedInGroundPortsTable(EObject element) {
		return ((ReferencesTableSettings)groundPorts.getInput()).contains(element);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getLabel()
	 * 
	 */
	public String getLabel() {
		return label.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setLabel(String newValue)
	 * 
	 */
	public void setLabel(String newValue) {
		if (newValue != null) {
			label.setText(newValue);
		} else {
			label.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.label);
		if (eefElementEditorReadOnlyState && label.isEnabled()) {
			label.setEnabled(false);
			label.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !label.isEnabled()) {
			label.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getComm()
	 * 
	 */
	public Enumerator getComm() {
		Enumerator selection = (Enumerator) ((StructuredSelection) comm.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initComm(Object input, Enumerator current)
	 */
	public void initComm(Object input, Enumerator current) {
		comm.setInput(input);
		comm.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.comm);
		if (eefElementEditorReadOnlyState && comm.isEnabled()) {
			comm.setEnabled(false);
			comm.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comm.isEnabled()) {
			comm.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setComm(Enumerator newValue)
	 * 
	 */
	public void setComm(Enumerator newValue) {
		comm.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.comm);
		if (eefElementEditorReadOnlyState && comm.isEnabled()) {
			comm.setEnabled(false);
			comm.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !comm.isEnabled()) {
			comm.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getFirmataMode()
	 * 
	 */
	public Enumerator getFirmataMode() {
		Enumerator selection = (Enumerator) ((StructuredSelection) firmataMode.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initFirmataMode(Object input, Enumerator current)
	 */
	public void initFirmataMode(Object input, Enumerator current) {
		firmataMode.setInput(input);
		firmataMode.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.firmataMode);
		if (eefElementEditorReadOnlyState && firmataMode.isEnabled()) {
			firmataMode.setEnabled(false);
			firmataMode.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !firmataMode.isEnabled()) {
			firmataMode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setFirmataMode(Enumerator newValue)
	 * 
	 */
	public void setFirmataMode(Enumerator newValue) {
		firmataMode.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.firmataMode);
		if (eefElementEditorReadOnlyState && firmataMode.isEnabled()) {
			firmataMode.setEnabled(false);
			firmataMode.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !firmataMode.isEnabled()) {
			firmataMode.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getLockedPin()
	 * 
	 */
	public Enumerator getLockedPin() {
		Enumerator selection = (Enumerator) ((StructuredSelection) lockedPin.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initLockedPin(Object input, Enumerator current)
	 */
	public void initLockedPin(Object input, Enumerator current) {
		lockedPin.setInput(input);
		lockedPin.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.lockedPin);
		if (eefElementEditorReadOnlyState && lockedPin.isEnabled()) {
			lockedPin.setEnabled(false);
			lockedPin.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !lockedPin.isEnabled()) {
			lockedPin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setLockedPin(Enumerator newValue)
	 * 
	 */
	public void setLockedPin(Enumerator newValue) {
		lockedPin.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.lockedPin);
		if (eefElementEditorReadOnlyState && lockedPin.isEnabled()) {
			lockedPin.setEnabled(false);
			lockedPin.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !lockedPin.isEnabled()) {
			lockedPin.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getSynchronizing()
	 * 
	 */
	public Boolean getSynchronizing() {
		return Boolean.valueOf(synchronizing.getSelection());
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setSynchronizing(Boolean newValue)
	 * 
	 */
	public void setSynchronizing(Boolean newValue) {
		if (newValue != null) {
			synchronizing.setSelection(newValue.booleanValue());
		} else {
			synchronizing.setSelection(false);
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.synchronizing);
		if (eefElementEditorReadOnlyState && synchronizing.isEnabled()) {
			synchronizing.setEnabled(false);
			synchronizing.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !synchronizing.isEnabled()) {
			synchronizing.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getStatus()
	 * 
	 */
	public Enumerator getStatus() {
		Enumerator selection = (Enumerator) ((StructuredSelection) status.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initStatus(Object input, Enumerator current)
	 */
	public void initStatus(Object input, Enumerator current) {
		status.setInput(input);
		status.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.status);
		if (eefElementEditorReadOnlyState && status.isEnabled()) {
			status.setEnabled(false);
			status.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !status.isEnabled()) {
			status.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setStatus(Enumerator newValue)
	 * 
	 */
	public void setStatus(Enumerator newValue) {
		status.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.status);
		if (eefElementEditorReadOnlyState && status.isEnabled()) {
			status.setEnabled(false);
			status.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !status.isEnabled()) {
			status.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getKind()
	 * 
	 */
	public Enumerator getKind() {
		Enumerator selection = (Enumerator) ((StructuredSelection) kind.getSelection()).getFirstElement();
		return selection;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#initKind(Object input, Enumerator current)
	 */
	public void initKind(Object input, Enumerator current) {
		kind.setInput(input);
		kind.modelUpdating(new StructuredSelection(current));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setKind(Enumerator newValue)
	 * 
	 */
	public void setKind(Enumerator newValue) {
		kind.modelUpdating(new StructuredSelection(newValue));
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.kind);
		if (eefElementEditorReadOnlyState && kind.isEnabled()) {
			kind.setEnabled(false);
			kind.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
		} else if (!eefElementEditorReadOnlyState && !kind.isEnabled()) {
			kind.setEnabled(true);
		}	
		
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#getName()
	 * 
	 */
	public String getName() {
		return name.getText();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * @see net.sf.smbt.mdl.arduino.parts.ArduinoPropertiesEditionPart#setName(String newValue)
	 * 
	 */
	public void setName(String newValue) {
		if (newValue != null) {
			name.setText(newValue);
		} else {
			name.setText(""); //$NON-NLS-1$
		}
		boolean eefElementEditorReadOnlyState = isReadOnly(ArduinoViewsRepository.Arduino_.Properties.name);
		if (eefElementEditorReadOnlyState && name.isEnabled()) {
			name.setEnabled(false);
			name.setToolTipText(ArduinoMessages.Arduino_ReadOnly);
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
		return ArduinoMessages.Arduino_Part_Title;
	}

	// Start of user code additional methods
	
	// End of user code


}
