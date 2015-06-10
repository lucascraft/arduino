/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package net.sf.smbt.mdl.arduino;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PIN MAPPING</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see net.sf.smbt.mdl.arduino.ArduinoPackage#getPIN_MAPPING()
 * @model
 * @generated
 */
public enum PIN_MAPPING implements Enumerator {
	/**
	 * The '<em><b>PIN AREF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_AREF_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_AREF(27, "PIN_AREF", "AREF"), /**
	 * The '<em><b>PIN TX I</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_TX_I_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_TX_I(33, "PIN_TX_I", "TX I"), /**
	 * The '<em><b>PIN TX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_TX_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_TX(0, "PIN_TX", "TX"),

	/**
	 * The '<em><b>PIN RX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_RX_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_RX(1, "PIN_RX", "RX"),

	/**
	 * The '<em><b>PIN D2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D2_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D2(2, "PIN_D2", "Digital 2"),

	/**
	 * The '<em><b>PIN D3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D3_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D3(3, "PIN_D3", "Digital 3"),

	/**
	 * The '<em><b>PIN D4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D4_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D4(4, "PIN_D4", "Digital 4"),

	/**
	 * The '<em><b>PIN D5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D5_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D5(5, "PIN_D5", "Digital 5"),

	/**
	 * The '<em><b>PIN D6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D6_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D6(6, "PIN_D6", "Digital 6"),

	/**
	 * The '<em><b>PIN D7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D7_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D7(7, "PIN_D7", "Digital 7"),

	/**
	 * The '<em><b>PIN D8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D8_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D8(8, "PIN_D8", "Digital 8"),

	/**
	 * The '<em><b>PIN D9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D9_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D9(9, "PIN_D9", "Digital 9"),

	/**
	 * The '<em><b>PIN D10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D10_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D10(10, "PIN_D10", "Digital 10"),

	/**
	 * The '<em><b>PIN D11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D11_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D11(11, "PIN_D11", "Digital 11"),

	/**
	 * The '<em><b>PIN D12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D12_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D12(12, "PIN_D12", "Digital 12"),

	/**
	 * The '<em><b>PIN D13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D13_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D13(13, "PIN_D13", "Digital 13"),

	/**
	 * The '<em><b>PIN D14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D14_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D14(14, "PIN_D14", "Digital 14"), /**
	 * The '<em><b>PIN D15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D15_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D15(15, "PIN_D15", "Digital 15"), /**
	 * The '<em><b>PIN D16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D16_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D16(16, "PIN_D16", "Digital 16"), /**
	 * The '<em><b>PIN D17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D17_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D17(17, "PIN_D17", "Digital 17"), /**
	 * The '<em><b>PIN D18</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D18_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D18(18, "PIN_D18", "Digital 18"), /**
	 * The '<em><b>PIN D19</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D19_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D19(19, "PIN_D19", "Digital 19"), /**
	 * The '<em><b>PIN D20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D20_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D20(20, "PIN_D20", "Digital 20"), /**
	 * The '<em><b>PIN D21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D21_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D21(21, "PIN_D21", "Digital 21"), /**
	 * The '<em><b>PIN D37</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D37_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D37(37, "PIN_D37", "Digital 37"), /**
	 * The '<em><b>PIN GND D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_GND_D_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_GND_D(30, "PIN_GND_D", "PIN_GND_D"), /**
	 * The '<em><b>PIN 3V3 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_3V3_1_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_3V3_1(14, "PIN_3V3_1", "PIN_3V3_1"),

	/**
	 * The '<em><b>PIN 3V3 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_3V3_2_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_3V3_2(15, "PIN_3V3_2", "PIN_3V3_2"),

	/**
	 * The '<em><b>PIN 5V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_5V_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_5V(28, "PIN_5V", "PIN_5V"), /**
	 * The '<em><b>PIN 9V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_9V_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_9V(29, "PIN_9V", "PIN_9V"), /**
	 * The '<em><b>PIN GND 9V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_GND_9V_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_GND_9V(16, "PIN_GND_9V", "GND 9V"), /**
	 * The '<em><b>PIN GND 3V</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_GND_3V_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_GND_3V(17, "PIN_GND_3V", "GND 3V"), /**
	 * The '<em><b>PIN RST</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_RST_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_RST(18, "PIN_RST", "Reset"),

	/**
	 * The '<em><b>PIN A0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A0_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A0(0, "PIN_A0", "Analog 0"),

	/**
	 * The '<em><b>PIN A1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A1_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A1(1, "PIN_A1", "Analog 1"),

	/**
	 * The '<em><b>PIN A2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A2_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A2(2, "PIN_A2", "Analog 2"),

	/**
	 * The '<em><b>PIN A3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A3_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A3(3, "PIN_A3", "Analog 3"),

	/**
	 * The '<em><b>PIN A4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A4_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A4(4, "PIN_A4", "Analog 4"),

	/**
	 * The '<em><b>PIN A5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A5_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A5(5, "PIN_A5", "Analog 5"),

	/**
	 * The '<em><b>PIN A6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A6_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A6(6, "PIN_A6", "Analog 6"),

	/**
	 * The '<em><b>PIN A7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A7_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A7(7, "PIN_A7", "Analog 7"), /**
	 * The '<em><b>PIN A8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A8_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A8(8, "PIN_A8", "Analog 8"), /**
	 * The '<em><b>PIN A9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A9_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A9(9, "PIN_A9", "Analog 9"), /**
	 * The '<em><b>PIN A10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A10_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A10(10, "PIN_A10", "Analog 10"), /**
	 * The '<em><b>PIN A11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A11_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A11(11, "PIN_A11", "Analog 11"), /**
	 * The '<em><b>PIN A12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A12_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A12(12, "PIN_A12", "Analog 12"), /**
	 * The '<em><b>PIN A13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A13_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A13(13, "PIN_A13", "Analog 13"), /**
	 * The '<em><b>PIN A14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A14_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A14(14, "PIN_A14", "Analog 14"), /**
	 * The '<em><b>PIN A15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A15_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A15(15, "PIN_A15", "Analog 15"), /**
	 * The '<em><b>PIN VIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_VIN_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_VIN(31, "PIN_VIN", "VIN"), /**
	 * The '<em><b>PIN TX O</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_TX_O_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_TX_O(32, "PIN_TX_O", "TX O"), /**
	 * The '<em><b>PIN D22</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D22_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D22(22, "PIN_D22", "Digital 22"), /**
	 * The '<em><b>PIN D23</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D23_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D23(23, "PIN_D23", "Digital 23"), /**
	 * The '<em><b>PIN D24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D24_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D24(24, "PIN_D24", "Digital 24"), /**
	 * The '<em><b>PIN D25</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D25_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D25(25, "PIN_D25", "Digital 25"), /**
	 * The '<em><b>PIN D26</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D26_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D26(26, "PIN_D26", "Digital 26"), /**
	 * The '<em><b>PIN D27</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D27_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D27(27, "PIN_D27", "Digital 27"), /**
	 * The '<em><b>PIN D28</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D28_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D28(28, "PIN_D28", "Digital 28"), /**
	 * The '<em><b>PIN D29</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D29_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D29(29, "PIN_D29", "Digital 29"), /**
	 * The '<em><b>PIN D30</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D30_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D30(30, "PIN_D30", "Digital 30"), /**
	 * The '<em><b>PIN D31</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D31_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D31(31, "PIN_D31", "Digital 31"), /**
	 * The '<em><b>PIN D32</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D32_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D32(32, "PIN_D32", "Digital 32"), /**
	 * The '<em><b>PIN D33</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D33_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D33(33, "PIN_D33", "Digital 33"), /**
	 * The '<em><b>PIN D34</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D34_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D34(34, "PIN_D34", "Digital 34"), /**
	 * The '<em><b>PIN D35</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D35_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D35(35, "PIN_D35", "Digital 35"), /**
	 * The '<em><b>PIN D36</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D36_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D36(36, "PIN_D36", "Digital 36"), /**
	 * The '<em><b>PIN D38</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D38_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D38(38, "PIN_D38", "Digital 38"), /**
	 * The '<em><b>PIN D39</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D39_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D39(39, "PIN_D39", "Digital 39"), /**
	 * The '<em><b>PIN D40</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D40_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D40(40, "PIN_D40", "Digital 40"), /**
	 * The '<em><b>PIN D41</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D41_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D41(41, "PIN_D41", "Digital 41"), /**
	 * The '<em><b>PIN D42</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D42_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D42(42, "PIN_D42", "Digital 42"), /**
	 * The '<em><b>PIN D43</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D43_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D43(43, "PIN_D43", "Digital 43"), /**
	 * The '<em><b>PIN D44</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D44_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D44(44, "PIN_D44", "Digital 44"), /**
	 * The '<em><b>PIN D45</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D45_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D45(45, "PIN_D45", "Digital 45"), /**
	 * The '<em><b>PIN D46</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D46_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D46(46, "PIN_D46", "Digital 46"), /**
	 * The '<em><b>PIN D47</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D47_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D47(47, "PIN_D47", "Digital 47"), /**
	 * The '<em><b>PIN D48</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D48_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D48(48, "PIN_D48", "Digital 48"), /**
	 * The '<em><b>PIN D49</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D49_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D49(49, "PIN_D49", "Digital 49"), /**
	 * The '<em><b>PIN D50</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D50_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D50(50, "PIN_D50", "Digital 50"), /**
	 * The '<em><b>PIN D51</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D51_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D51(51, "PIN_D51", "Digital 51"), /**
	 * The '<em><b>PIN D52</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_D52_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_D52(52, "PIN_D52", "Digital 52"), /**
	 * The '<em><b>PIN IO7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_IO7_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_IO7(82, "PIN_IO7", "PIN_IO7"), /**
	 * The '<em><b>UNKNOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(0, "UNKNOWN", "UNKNOWN"), /**
	 * The '<em><b>PIN A16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A16_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A16(16, "PIN_A16", "Analog 16"), /**
	 * The '<em><b>PIN A17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A17_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A17(17, "PIN_A17", "Analog 17"), /**
	 * The '<em><b>PIN A18</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A18_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A18(18, "PIN_A18", "Analog 18"), /**
	 * The '<em><b>PIN A19</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A19_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A19(19, "PIN_A19", "Analog 19"), /**
	 * The '<em><b>PIN A20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A20_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A20(20, "PIN_A20", "Analog 20"), /**
	 * The '<em><b>PIN A21</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A21_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A21(21, "PIN_A21", "Analog 21"), /**
	 * The '<em><b>PIN A22</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A22_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A22(22, "PIN_A22", "Analog 22"), /**
	 * The '<em><b>PIN A23</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A23_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A23(23, "PIN_A23", "Analog 23"), /**
	 * The '<em><b>PIN A24</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PIN_A24_VALUE
	 * @generated
	 * @ordered
	 */
	PIN_A24(24, "PIN_A24", "Analog 24");

	/**
	 * The '<em><b>PIN AREF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN AREF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_AREF
	 * @model literal="AREF"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_AREF_VALUE = 27;

	/**
	 * The '<em><b>PIN TX I</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN TX I</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_TX_I
	 * @model literal="TX I"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_TX_I_VALUE = 33;

	/**
	 * The '<em><b>PIN TX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN TX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_TX
	 * @model literal="TX"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_TX_VALUE = 0;

	/**
	 * The '<em><b>PIN RX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN RX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_RX
	 * @model literal="RX"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_RX_VALUE = 1;

	/**
	 * The '<em><b>PIN D2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D2
	 * @model literal="Digital 2"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D2_VALUE = 2;

	/**
	 * The '<em><b>PIN D3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D3
	 * @model literal="Digital 3"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D3_VALUE = 3;

	/**
	 * The '<em><b>PIN D4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D4
	 * @model literal="Digital 4"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D4_VALUE = 4;

	/**
	 * The '<em><b>PIN D5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D5
	 * @model literal="Digital 5"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D5_VALUE = 5;

	/**
	 * The '<em><b>PIN D6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D6
	 * @model literal="Digital 6"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D6_VALUE = 6;

	/**
	 * The '<em><b>PIN D7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D7
	 * @model literal="Digital 7"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D7_VALUE = 7;

	/**
	 * The '<em><b>PIN D8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D8
	 * @model literal="Digital 8"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D8_VALUE = 8;

	/**
	 * The '<em><b>PIN D9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D9
	 * @model literal="Digital 9"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D9_VALUE = 9;

	/**
	 * The '<em><b>PIN D10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D10
	 * @model literal="Digital 10"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D10_VALUE = 10;

	/**
	 * The '<em><b>PIN D11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D11</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D11
	 * @model literal="Digital 11"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D11_VALUE = 11;

	/**
	 * The '<em><b>PIN D12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D12</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D12
	 * @model literal="Digital 12"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D12_VALUE = 12;

	/**
	 * The '<em><b>PIN D13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D13</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D13
	 * @model literal="Digital 13"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D13_VALUE = 13;

	/**
	 * The '<em><b>PIN D14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D14</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D14
	 * @model literal="Digital 14"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D14_VALUE = 14;

	/**
	 * The '<em><b>PIN D15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D15</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D15
	 * @model literal="Digital 15"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D15_VALUE = 15;

	/**
	 * The '<em><b>PIN D16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D16
	 * @model literal="Digital 16"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D16_VALUE = 16;

	/**
	 * The '<em><b>PIN D17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D17</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D17
	 * @model literal="Digital 17"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D17_VALUE = 17;

	/**
	 * The '<em><b>PIN D18</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D18</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D18
	 * @model literal="Digital 18"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D18_VALUE = 18;

	/**
	 * The '<em><b>PIN D19</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D19</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D19
	 * @model literal="Digital 19"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D19_VALUE = 19;

	/**
	 * The '<em><b>PIN D20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D20</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D20
	 * @model literal="Digital 20"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D20_VALUE = 20;

	/**
	 * The '<em><b>PIN D21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D21</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D21
	 * @model literal="Digital 21"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D21_VALUE = 21;

	/**
	 * The '<em><b>PIN D37</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D37</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D37
	 * @model literal="Digital 37"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D37_VALUE = 37;

	/**
	 * The '<em><b>PIN GND D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN GND D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_GND_D
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIN_GND_D_VALUE = 30;

	/**
	 * The '<em><b>PIN 3V3 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN 3V3 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_3V3_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIN_3V3_1_VALUE = 14;

	/**
	 * The '<em><b>PIN 3V3 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN 3V3 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_3V3_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIN_3V3_2_VALUE = 15;

	/**
	 * The '<em><b>PIN 5V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN 5V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_5V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIN_5V_VALUE = 28;

	/**
	 * The '<em><b>PIN 9V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN 9V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_9V
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIN_9V_VALUE = 29;

	/**
	 * The '<em><b>PIN GND 9V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN GND 9V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_GND_9V
	 * @model literal="GND 9V"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_GND_9V_VALUE = 16;

	/**
	 * The '<em><b>PIN GND 3V</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN GND 3V</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_GND_3V
	 * @model literal="GND 3V"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_GND_3V_VALUE = 17;

	/**
	 * The '<em><b>PIN RST</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN RST</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_RST
	 * @model literal="Reset"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_RST_VALUE = 18;

	/**
	 * The '<em><b>PIN A0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A0
	 * @model literal="Analog 0"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A0_VALUE = 0;

	/**
	 * The '<em><b>PIN A1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A1
	 * @model literal="Analog 1"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A1_VALUE = 1;

	/**
	 * The '<em><b>PIN A2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A2
	 * @model literal="Analog 2"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A2_VALUE = 2;

	/**
	 * The '<em><b>PIN A3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A3
	 * @model literal="Analog 3"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A3_VALUE = 3;

	/**
	 * The '<em><b>PIN A4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A4
	 * @model literal="Analog 4"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A4_VALUE = 4;

	/**
	 * The '<em><b>PIN A5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A5
	 * @model literal="Analog 5"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A5_VALUE = 5;

	/**
	 * The '<em><b>PIN A6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A6
	 * @model literal="Analog 6"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A6_VALUE = 6;

	/**
	 * The '<em><b>PIN A7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A7
	 * @model literal="Analog 7"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A7_VALUE = 7;

	/**
	 * The '<em><b>PIN A8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A8
	 * @model literal="Analog 8"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A8_VALUE = 8;

	/**
	 * The '<em><b>PIN A9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A9
	 * @model literal="Analog 9"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A9_VALUE = 9;

	/**
	 * The '<em><b>PIN A10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A10
	 * @model literal="Analog 10"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A10_VALUE = 10;

	/**
	 * The '<em><b>PIN A11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A11</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A11
	 * @model literal="Analog 11"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A11_VALUE = 11;

	/**
	 * The '<em><b>PIN A12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A12</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A12
	 * @model literal="Analog 12"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A12_VALUE = 12;

	/**
	 * The '<em><b>PIN A13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A13</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A13
	 * @model literal="Analog 13"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A13_VALUE = 13;

	/**
	 * The '<em><b>PIN A14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A14</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A14
	 * @model literal="Analog 14"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A14_VALUE = 14;

	/**
	 * The '<em><b>PIN A15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A15</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A15
	 * @model literal="Analog 15"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A15_VALUE = 15;

	/**
	 * The '<em><b>PIN VIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN VIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_VIN
	 * @model literal="VIN"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_VIN_VALUE = 31;

	/**
	 * The '<em><b>PIN TX O</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN TX O</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_TX_O
	 * @model literal="TX O"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_TX_O_VALUE = 32;

	/**
	 * The '<em><b>PIN D22</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D22</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D22
	 * @model literal="Digital 22"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D22_VALUE = 22;

	/**
	 * The '<em><b>PIN D23</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D23</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D23
	 * @model literal="Digital 23"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D23_VALUE = 23;

	/**
	 * The '<em><b>PIN D24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D24</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D24
	 * @model literal="Digital 24"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D24_VALUE = 24;

	/**
	 * The '<em><b>PIN D25</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D25</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D25
	 * @model literal="Digital 25"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D25_VALUE = 25;

	/**
	 * The '<em><b>PIN D26</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D26</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D26
	 * @model literal="Digital 26"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D26_VALUE = 26;

	/**
	 * The '<em><b>PIN D27</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D27</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D27
	 * @model literal="Digital 27"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D27_VALUE = 27;

	/**
	 * The '<em><b>PIN D28</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D28</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D28
	 * @model literal="Digital 28"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D28_VALUE = 28;

	/**
	 * The '<em><b>PIN D29</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D29</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D29
	 * @model literal="Digital 29"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D29_VALUE = 29;

	/**
	 * The '<em><b>PIN D30</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D30</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D30
	 * @model literal="Digital 30"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D30_VALUE = 30;

	/**
	 * The '<em><b>PIN D31</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D31</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D31
	 * @model literal="Digital 31"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D31_VALUE = 31;

	/**
	 * The '<em><b>PIN D32</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D32</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D32
	 * @model literal="Digital 32"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D32_VALUE = 32;

	/**
	 * The '<em><b>PIN D33</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D33</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D33
	 * @model literal="Digital 33"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D33_VALUE = 33;

	/**
	 * The '<em><b>PIN D34</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D34</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D34
	 * @model literal="Digital 34"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D34_VALUE = 34;

	/**
	 * The '<em><b>PIN D35</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D35</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D35
	 * @model literal="Digital 35"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D35_VALUE = 35;

	/**
	 * The '<em><b>PIN D36</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D36</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D36
	 * @model literal="Digital 36"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D36_VALUE = 36;

	/**
	 * The '<em><b>PIN D38</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D38</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D38
	 * @model literal="Digital 38"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D38_VALUE = 38;

	/**
	 * The '<em><b>PIN D39</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D39</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D39
	 * @model literal="Digital 39"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D39_VALUE = 39;

	/**
	 * The '<em><b>PIN D40</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D40</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D40
	 * @model literal="Digital 40"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D40_VALUE = 40;

	/**
	 * The '<em><b>PIN D41</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D41</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D41
	 * @model literal="Digital 41"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D41_VALUE = 41;

	/**
	 * The '<em><b>PIN D42</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D42</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D42
	 * @model literal="Digital 42"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D42_VALUE = 42;

	/**
	 * The '<em><b>PIN D43</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D43</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D43
	 * @model literal="Digital 43"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D43_VALUE = 43;

	/**
	 * The '<em><b>PIN D44</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D44</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D44
	 * @model literal="Digital 44"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D44_VALUE = 44;

	/**
	 * The '<em><b>PIN D45</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D45</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D45
	 * @model literal="Digital 45"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D45_VALUE = 45;

	/**
	 * The '<em><b>PIN D46</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D46</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D46
	 * @model literal="Digital 46"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D46_VALUE = 46;

	/**
	 * The '<em><b>PIN D47</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D47</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D47
	 * @model literal="Digital 47"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D47_VALUE = 47;

	/**
	 * The '<em><b>PIN D48</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D48</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D48
	 * @model literal="Digital 48"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D48_VALUE = 48;

	/**
	 * The '<em><b>PIN D49</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D49</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D49
	 * @model literal="Digital 49"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D49_VALUE = 49;

	/**
	 * The '<em><b>PIN D50</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D50</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D50
	 * @model literal="Digital 50"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D50_VALUE = 50;

	/**
	 * The '<em><b>PIN D51</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D51</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D51
	 * @model literal="Digital 51"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D51_VALUE = 51;

	/**
	 * The '<em><b>PIN D52</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN D52</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_D52
	 * @model literal="Digital 52"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_D52_VALUE = 52;

	/**
	 * The '<em><b>PIN IO7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN IO7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_IO7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PIN_IO7_VALUE = 82;

	/**
	 * The '<em><b>UNKNOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 0;

	/**
	 * The '<em><b>PIN A16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A16
	 * @model literal="Analog 16"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A16_VALUE = 16;

	/**
	 * The '<em><b>PIN A17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A17</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A17
	 * @model literal="Analog 17"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A17_VALUE = 17;

	/**
	 * The '<em><b>PIN A18</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A18</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A18
	 * @model literal="Analog 18"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A18_VALUE = 18;

	/**
	 * The '<em><b>PIN A19</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A19</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A19
	 * @model literal="Analog 19"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A19_VALUE = 19;

	/**
	 * The '<em><b>PIN A20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A20</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A20
	 * @model literal="Analog 20"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A20_VALUE = 20;

	/**
	 * The '<em><b>PIN A21</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A21</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A21
	 * @model literal="Analog 21"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A21_VALUE = 21;

	/**
	 * The '<em><b>PIN A22</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A22</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A22
	 * @model literal="Analog 22"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A22_VALUE = 22;

	/**
	 * The '<em><b>PIN A23</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A23</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A23
	 * @model literal="Analog 23"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A23_VALUE = 23;

	/**
	 * The '<em><b>PIN A24</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PIN A24</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PIN_A24
	 * @model literal="Analog 24"
	 * @generated
	 * @ordered
	 */
	public static final int PIN_A24_VALUE = 24;

	/**
	 * An array of all the '<em><b>PIN MAPPING</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PIN_MAPPING[] VALUES_ARRAY =
		new PIN_MAPPING[] {
			PIN_AREF,
			PIN_TX_I,
			PIN_TX,
			PIN_RX,
			PIN_D2,
			PIN_D3,
			PIN_D4,
			PIN_D5,
			PIN_D6,
			PIN_D7,
			PIN_D8,
			PIN_D9,
			PIN_D10,
			PIN_D11,
			PIN_D12,
			PIN_D13,
			PIN_D14,
			PIN_D15,
			PIN_D16,
			PIN_D17,
			PIN_D18,
			PIN_D19,
			PIN_D20,
			PIN_D21,
			PIN_D37,
			PIN_GND_D,
			PIN_3V3_1,
			PIN_3V3_2,
			PIN_5V,
			PIN_9V,
			PIN_GND_9V,
			PIN_GND_3V,
			PIN_RST,
			PIN_A0,
			PIN_A1,
			PIN_A2,
			PIN_A3,
			PIN_A4,
			PIN_A5,
			PIN_A6,
			PIN_A7,
			PIN_A8,
			PIN_A9,
			PIN_A10,
			PIN_A11,
			PIN_A12,
			PIN_A13,
			PIN_A14,
			PIN_A15,
			PIN_VIN,
			PIN_TX_O,
			PIN_D22,
			PIN_D23,
			PIN_D24,
			PIN_D25,
			PIN_D26,
			PIN_D27,
			PIN_D28,
			PIN_D29,
			PIN_D30,
			PIN_D31,
			PIN_D32,
			PIN_D33,
			PIN_D34,
			PIN_D35,
			PIN_D36,
			PIN_D38,
			PIN_D39,
			PIN_D40,
			PIN_D41,
			PIN_D42,
			PIN_D43,
			PIN_D44,
			PIN_D45,
			PIN_D46,
			PIN_D47,
			PIN_D48,
			PIN_D49,
			PIN_D50,
			PIN_D51,
			PIN_D52,
			PIN_IO7,
			UNKNOWN,
			PIN_A16,
			PIN_A17,
			PIN_A18,
			PIN_A19,
			PIN_A20,
			PIN_A21,
			PIN_A22,
			PIN_A23,
			PIN_A24,
		};

	/**
	 * A public read-only list of all the '<em><b>PIN MAPPING</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PIN_MAPPING> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PIN MAPPING</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PIN_MAPPING get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PIN_MAPPING result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PIN MAPPING</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PIN_MAPPING getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PIN_MAPPING result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PIN MAPPING</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PIN_MAPPING get(int value) {
		switch (value) {
			case PIN_AREF_VALUE: return PIN_AREF;
			case PIN_TX_I_VALUE: return PIN_TX_I;
			case PIN_TX_VALUE: return PIN_TX;
			case PIN_RX_VALUE: return PIN_RX;
			case PIN_D2_VALUE: return PIN_D2;
			case PIN_D3_VALUE: return PIN_D3;
			case PIN_D4_VALUE: return PIN_D4;
			case PIN_D5_VALUE: return PIN_D5;
			case PIN_D6_VALUE: return PIN_D6;
			case PIN_D7_VALUE: return PIN_D7;
			case PIN_D8_VALUE: return PIN_D8;
			case PIN_D9_VALUE: return PIN_D9;
			case PIN_D10_VALUE: return PIN_D10;
			case PIN_D11_VALUE: return PIN_D11;
			case PIN_D12_VALUE: return PIN_D12;
			case PIN_D13_VALUE: return PIN_D13;
			case PIN_D14_VALUE: return PIN_D14;
			case PIN_D15_VALUE: return PIN_D15;
			case PIN_D16_VALUE: return PIN_D16;
			case PIN_D17_VALUE: return PIN_D17;
			case PIN_D18_VALUE: return PIN_D18;
			case PIN_D19_VALUE: return PIN_D19;
			case PIN_D20_VALUE: return PIN_D20;
			case PIN_D21_VALUE: return PIN_D21;
			case PIN_D37_VALUE: return PIN_D37;
			case PIN_GND_D_VALUE: return PIN_GND_D;
			case PIN_5V_VALUE: return PIN_5V;
			case PIN_9V_VALUE: return PIN_9V;
			case PIN_VIN_VALUE: return PIN_VIN;
			case PIN_TX_O_VALUE: return PIN_TX_O;
			case PIN_D22_VALUE: return PIN_D22;
			case PIN_D23_VALUE: return PIN_D23;
			case PIN_D24_VALUE: return PIN_D24;
			case PIN_D25_VALUE: return PIN_D25;
			case PIN_D26_VALUE: return PIN_D26;
			case PIN_D34_VALUE: return PIN_D34;
			case PIN_D35_VALUE: return PIN_D35;
			case PIN_D36_VALUE: return PIN_D36;
			case PIN_D38_VALUE: return PIN_D38;
			case PIN_D39_VALUE: return PIN_D39;
			case PIN_D40_VALUE: return PIN_D40;
			case PIN_D41_VALUE: return PIN_D41;
			case PIN_D42_VALUE: return PIN_D42;
			case PIN_D43_VALUE: return PIN_D43;
			case PIN_D44_VALUE: return PIN_D44;
			case PIN_D45_VALUE: return PIN_D45;
			case PIN_D46_VALUE: return PIN_D46;
			case PIN_D47_VALUE: return PIN_D47;
			case PIN_D48_VALUE: return PIN_D48;
			case PIN_D49_VALUE: return PIN_D49;
			case PIN_D50_VALUE: return PIN_D50;
			case PIN_D51_VALUE: return PIN_D51;
			case PIN_D52_VALUE: return PIN_D52;
			case PIN_IO7_VALUE: return PIN_IO7;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private PIN_MAPPING(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //PIN_MAPPING
