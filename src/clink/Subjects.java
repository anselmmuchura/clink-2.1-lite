/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clink;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import org.apache.commons.lang3.text.WordUtils;

/**
 *
 * @author ANSELMO
 */
public class Subjects extends javax.swing.JFrame {

    private int x;
    private int y;
    String subjects_path = "filter.txt";
    
    
    public Subjects() {
        
        super("Subject");
        
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int result = JOptionPane.showConfirmDialog(null, "Do you want to Exit ?", "Exit Confirmation : ",
                        JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else if (result == JOptionPane.NO_OPTION) {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
        setUndecorated(true);
        pack();
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        setSize(width / 3, height / 2);

        // here's the part where i center the jframe on screen
        setLocationRelativeTo(null);
        setVisible(true);
        initComponents();
        
        
        //get filter subjects
        String filter=Config.readFile("filter.txt");
        filter = filter.toString().trim();
        
        if(filter.equals("none")){
            String subjects[];
        }
        
        String [] filterArray=filter.split(",");
     
        if(filterArray.length > 0){
            
            List<String> list = Arrays.asList(filterArray);
            
            //System.out.println(list);
            
            if(list.contains("All")){
                checkAll.setSelected(true);
                checkEnglishLanguage.setSelected(true);
                checkAfricanHistory.setSelected(true);
                checkArtDesign.setSelected(true);
                checkCreativeWriting.setSelected(true);
                checkJurisprudence.setSelected(true);
                checkModernHistory.setSelected(true);
                checkPoetry.setSelected(true);
                checkTheology.setSelected(true);
                checkAmericanHistory.setSelected(true);
                checkAncientHistory.setSelected(true);
           checkArtHistory.setSelected(true);
           checkCriminalLaw.setSelected(true);
           checkLaw.setSelected(true);
           checkFilm.setSelected(true);
           checkMusic.setSelected(true);
           checkRussianHistory.setSelected(true);
           checkVisualArts.setSelected(true);
           checkOther.setSelected(true);
           checkAccounting.setSelected(true);
           checkBlockchain.setSelected(true);
           checkBusinessAnalysis.setSelected(true);
           checkChildcare.setSelected(true);
           checkDentistry.setSelected(true);
           checkElectricalEngineering.setSelected(true);
           checkHealthCare.setSelected(true);
           checkInvestmentStrategies.setSelected(true);
           checkMaterialsScienceEngineering.setSelected(true);
           checkMoneyBanking.setSelected(true);
           checkRealProperty.setSelected(true);
           checkMarketing.setSelected(true);
           checkAdvertising.setSelected(true);
           checkBrandValue.setSelected(true);
           checkBusinessManagement.setSelected(true);
           checkCivilEngineering.setSelected(true);
           checkEngineering.setSelected(true);
           checkFluidMechanics.setSelected(true);
           checkHospitality.setSelected(true);
           checkLogistics.setSelected(true);
           checkMechanicalEngineering.setSelected(true);
           checkNegotiation.setSelected(true);
           checkStrategyTechnology.setSelected(true);
           checkSociology.setSelected(true);
           checkSocialWork.setSelected(true);
           checkCriminology.setSelected(true);
           checkHumanRights.setSelected(true);
           checkPsychology.setSelected(true);
           checkCommunicationStudies.setSelected(true);
           checkHumanGeography.setSelected(true);
           checkAlgebra.setSelected(true);
           checkAppliedMathematics.setSelected(true);
           checkAstronomy.setSelected(true);
           checkCellBiology.setSelected(true);
           checkCombinatorics.setSelected(true);
           checkComputerScience.setSelected(true);
           checkDistributedComputing.setSelected(true);
           checkEnvironmentalChemistry.setSelected(true);
           checkGeneralBiology.setSelected(true);
           checkGraphTheory.setSelected(true);
           checkInorganicChemestry.setSelected(true);
           checkMathematics.setSelected(true);
           checkOperatingSystems.setSelected(true);
           checkPhysics.setSelected(true);
           checkSpaceSciences.setSelected(true);
           checkTopology.setSelected(true);
           checkAnalyticalChemistry.setSelected(true);
           checkArtificialIntelligenece.setSelected(true);
           checkBiology.setSelected(true);
           checkCode.setSelected(true);
           checkComputerGraphics.setSelected(true);
           checkDataStructures.setSelected(true);
           checkEcology.setSelected(true);
           checkGameTheory.setSelected(true);
           checkGeometry.setSelected(true);
           checkInformationTheory.setSelected(true);
           checkMathematicalPhysics.setSelected(true);
           checkNutrition.setSelected(true);
           checkPhysicalChemistry.setSelected(true);
           checkQuantumComputing.setSelected(true);
           checkTheoryComputation.setSelected(true);
           checkHistory.setSelected(true);
           checkArchitecture.setSelected(true);
           checkAsianHistory.setSelected(true);
           checkDance.setSelected(true);
           checkHistoryCulture.setSelected(true);
           checkLegalManagement.setSelected(true);
           checkPerformingArts.setSelected(true);
           checkTelevision.setSelected(true);
           checkWorldHistory.setSelected(true);
           checkAdministrativeLaw.setSelected(true);
           checkAppliedArts.setSelected(true);
           checkCivilLaw.setSelected(true);
           checkLiterature.setSelected(true);
           checkHistoryLiterature.setSelected(true);
           checkLinguistics.setSelected(true);
           checkPhylosophy.setSelected(true);
           checkTheatre.setSelected(true);
           checkWorldLiterature.setSelected(true);
           checkNursing.setSelected(true);
           checkAnalysisStructures.setSelected(true);
           checkBuildingMaterialsTheory.setSelected(true);   
           checkCapitalMarkets.setSelected(true);
           checkClinicalPhysiology.setSelected(true);
           checkEconometrics.setSelected(true);
           checkEntrepreneurship.setSelected(true);
           checkFoodAgribusiness.setSelected(true);
           checkHumanResource.setSelected(true);
           checkMacroeconomics.setSelected(true);
           checkMedicineHealth.setSelected(true);
           checkPharmacology.setSelected(true);
           checkStructuralDesign.setSelected(true);
           checkOperationsManagement.setSelected(true);
           checkAudit.setSelected(true);
           checkBusiness.setSelected(true);
           checkChemicalEngineering.setSelected(true);
            checkCryptocurrencies.setSelected(true);
            checkEducationalTechnology.setSelected(true);
            checkEnvironmentalSciences.setSelected(true);
            checkHydrologyHydrolicSystems.setSelected(true);
            checkManagementStudies.setSelected(true);
            checkMicroeconomics.setSelected(true);
            checkPhysicalEducation.setSelected(true);
            checkBusinessEntertainment.setSelected(true);
            checkPoliticalScience.setSelected(true);
            checkArchaeology.setSelected(true);
            checkEducation.setSelected(true);
            checkEconomics.setSelected(true);
            checkAnthropology.setSelected(true);
            checkCulturalStudies.setSelected(true);
            checkTourism.setSelected(true);
            checkAnalysis.setSelected(true);
            checkApproximationTheory.setSelected(true);
            checkBiochemistry.setSelected(true);
            checkChemistry.setSelected(true);
            checkComputerCommunications.setSelected(true);
            checkCryptography.setSelected(true);
            checkEarthScience.setSelected(true);
            checkGeology.setSelected(true);
            checkImmunology.setSelected(true);
            checkMathematicalLogic.setSelected(true);
            checkNumericalAnalysis.setSelected(true);
            checkOrganicChemistry.setSelected(true);
            checkProgrammingLanguages.setSelected(true);
            checkTheoreticalPhysics.setSelected(true);
            checkAlgorithms.setSelected(true);
            checkAppliedPhysics.setSelected(true);
            checkAstrophysics.setSelected(true);
            checkEvolutionaryBiology.setSelected(true);
            checkComputerArchitecture.setSelected(true);
            checkComputerSecurity.setSelected(true);
            checkDynamicalSystems.setSelected(true);
            checkGeneralChemistry.setSelected(true);
            checkHumanComputerInteraction.setSelected(true);
            checkLogicComputerScience.setSelected(true);
            checkOperationsResearch.setSelected(true);
            checkNumberTheory.setSelected(true);
            checkStatistics.setSelected(true);
            checkProbabilityTheory.setSelected(true);
            checkZoology.setSelected(true);
            }
            
            if(list.contains(checkEnglishLanguage.getText().toString().trim())){
               checkEnglishLanguage.setSelected(true);
            }
        
            if(list.contains(checkAfricanHistory.getText().toString().trim())){
               checkAfricanHistory.setSelected(true);
            }
        
        if(list.contains(checkArtDesign.getText().toString().trim())){
            checkArtDesign.setSelected(true);
        }
        
        //Creative Writing
        if(list.contains(checkCreativeWriting.getText().toString().trim())){
           checkCreativeWriting.setSelected(true);
        }
        
        //Jurisprudence
        if(list.contains(checkJurisprudence.getText().toString().trim())){
            checkJurisprudence.setSelected(true);
        }
        
       //Modern History
        if(list.contains(checkModernHistory.getText().toString().trim())){
            checkModernHistory.setSelected(true);
        }
        
        //Poetry
        if(list.contains("Poetry")){
            checkPoetry.setSelected(true);
        }
        
        //Theology
        if(list.contains(checkTheology.getText().toString().trim())){
            checkTheology.setSelected(true);
        }
        
        //American History
        if(list.contains(checkAmericanHistory.getText().toString().trim())){
            checkAmericanHistory.setSelected(true);
        }
        
        //Ancient History
        if(list.contains(checkAncientHistory.getText().toString().trim())){
            checkAncientHistory.setSelected(true);
        }
        
        //Art History
        if(list.contains(checkArtHistory.getText().toString().trim())){
            checkArtHistory.setSelected(true);
        }
        
        //Criminal Law
        if(list.contains(checkCriminalLaw.getText().toString().trim())){
            checkCriminalLaw.setSelected(true);
        }
                
        //Film
        if(list.contains(checkFilm.getText().toString().trim())){
            checkFilm.setSelected(true);
        }
        
        //checkLaw
        if(list.contains(checkLaw.getText().toString().trim())){
            checkLaw.setSelected(true);
        }
        
        //Music
        if(list.contains(checkMusic.getText().toString().trim())){
            checkMusic.setSelected(true);
        }
        
        //Russian History
        if(list.contains(checkRussianHistory.getText().toString().trim())){
            checkRussianHistory.setSelected(true);
        }
        
        //Visual Arts
        if(list.contains(checkVisualArts.getText().toString().trim())){
            checkVisualArts.setSelected(true);
        }
        
        //Others
        if(list.contains(checkOther.getText().toString().trim())){
            checkOther.setSelected(true);
        }
        
        //Accounting
        if(list.contains(checkAccounting.getText().toString().trim())){
            checkAccounting.setSelected(true);
        }
        
        //Blockchain
        if(list.contains(checkBlockchain.getText().toString().trim())){
            checkBlockchain.setSelected(true);
        }
        
        //BusinessAnalysis
        if(list.contains(checkBusinessAnalysis.getText().toString().trim())){
            checkBusinessAnalysis.setSelected(true);
        }
        
        //Childcare
        if(list.contains(checkChildcare.getText().toString().trim())){
            checkChildcare.setSelected(true);
        }
        
        //Dentistry
        if(list.contains(checkDentistry.getText().toString().trim())){
            checkDentistry.setSelected(true);
        }
        
        //Electrical Engineering
        if(list.contains(checkElectricalEngineering.getText().toString().trim())){
            checkElectricalEngineering.setSelected(true);
        }
        
        //Health Care
        if(list.contains(checkHealthCare.getText().toString().trim())){
            checkHealthCare.setSelected(true);
        }
        
        //Investment Strategies
        if(list.contains(checkInvestmentStrategies.getText().toString().trim())){
            checkInvestmentStrategies.setSelected(true);
        }   
        
        //Materials Science Engineering
        if(list.contains(checkMaterialsScienceEngineering.getText().toString().trim())){
            checkMaterialsScienceEngineering.setSelected(true);
        }
        
        // Money Banking
        if(list.contains(checkMoneyBanking.getText().toString().trim())){
            checkMoneyBanking.setSelected(true);
        }
        
        // Real Property
        if(list.contains(checkRealProperty.getText().toString().trim())){
            checkRealProperty.setSelected(true);
        }
        
        // Marketing
        if(list.contains(checkMarketing.getText().toString().trim())){
            checkMarketing.setSelected(true);
        }
        
        //Advertising
        if(list.contains(checkAdvertising.getText().toString().trim())){
            checkAdvertising.setSelected(true);
        }
        
        //Brand value
        if(list.contains(checkBrandValue.getText().toString().trim())){
            checkBrandValue.setSelected(true);
        }
        
        //Business Management
        if(list.contains(checkBusinessManagement.getText().toString().trim())){
            checkBusinessManagement.setSelected(true);
        }
        
        // Civil Engineering
        if(list.contains(checkCivilEngineering.getText().toString().trim())){
            checkCivilEngineering.setSelected(true);
        }
        
        // Digital Innovation Transformation
        if(list.contains(checkDigitalInnovationTransformation.getText().toString().trim())){
            checkDigitalInnovationTransformation.setSelected(true);
        }
        
        // Engineering
        if(list.contains(checkEngineering.getText().toString().trim())){
            checkEngineering.setSelected(true);
        }
        
        // Fluid Mechanics
        if(list.contains(checkFluidMechanics.getText().toString().trim())){
            checkFluidMechanics.setSelected(true);
        }
        
        // Hospitality
        if(list.contains(checkHospitality.getText().toString().trim())){
            checkHospitality.setSelected(true);
        }
                
        // Logistics
        if(list.contains(checkLogistics.getText().toString().trim())){
            checkLogistics.setSelected(true);
        }
        
        // Mechanical Engineering
        if(list.contains(checkMechanicalEngineering.getText().toString().trim())){
            checkMechanicalEngineering.setSelected(true);
        }
        
        // Negotiation
        if(list.contains(checkNegotiation.getText().toString().trim())){
            checkNegotiation.setSelected(true);
        }
        
        // StrategyTechnology
        if(list.contains(checkStrategyTechnology.getText().toString().trim())){
            checkStrategyTechnology.setSelected(true);
        }
        
        // Sociology
        if(list.contains(checkSociology.getText().toString().trim())){
            checkSociology.setSelected(true);
        }
        
        // Social Work
        if(list.contains(checkSocialWork.getText().toString().trim())){
            checkSocialWork.setSelected(true);
        }
        
        // Criminology
        if(list.contains(checkCriminology.getText().toString().trim())){
            checkCriminology.setSelected(true);
        }
        
        // Human Rights
        if(list.contains(checkHumanRights.getText().toString().trim())){
            checkHumanRights.setSelected(true);
        }
        
        // Phsycology
        if(list.contains(checkPsychology.getText().toString().trim())){
            checkPsychology.setSelected(true);
        }
        
        // Communication Studies
        if(list.contains(checkCommunicationStudies.getText().toString().trim())){
            checkCommunicationStudies.setSelected(true);
        }
        
        // Human Geography
        if(list.contains(checkHumanGeography.getText().toString().trim())){
            checkHumanGeography.setSelected(true);
        }
        
        // Algebra
        if(list.contains(checkAlgebra.getText().toString().trim())){
            checkAlgebra.setSelected(true);
        }
        
        // Applied Mathematics
        if(list.contains(checkAppliedMathematics.getText().toString().trim())){
            checkAppliedMathematics.setSelected(true);
        }
        
        // Astronomy
        if(list.contains(checkAstronomy.getText().toString().trim())){
           checkAstronomy.setSelected(true);
        }
        
        // Cell Biology
        if(list.contains(checkCellBiology.getText().toString().trim())){
            checkCellBiology.setSelected(true);
        }
        
        // Combinatorics
        if(list.contains(checkCombinatorics.getText().toString().trim())){
            checkCombinatorics.setSelected(true);
        }
        
        // Computer Science
        if(list.contains(checkComputerScience.getText().toString().trim())){
            checkComputerScience.setSelected(true);
        }
        
        // Distributed Computing
        if(list.contains(checkDistributedComputing.getText().toString().trim())){
            checkDistributedComputing.setSelected(true);
        }
        
        // Environmental Chemistry
        if(list.contains(checkEnvironmentalChemistry.getText().toString().trim())){
            checkEnvironmentalChemistry.setSelected(true);
        }
        
        // General Biology
        if(list.contains(checkGeneralBiology.getText().toString().trim())){
            checkGeneralBiology.setSelected(true);
        }
        
        // Graph Theory
        if(list.contains(checkGraphTheory.getText().toString().trim())){
            checkGraphTheory.setSelected(true);
        }
        
        // Inorganic Chemistry
        if(list.contains(checkInorganicChemestry.getText().toString().trim())){
            checkInorganicChemestry.setSelected(true);
        }
        
        // Mathematics
        if(list.contains(checkMathematics.getText().toString().trim())){
            checkMathematics.setSelected(true);
        }
        
        // Operating Systmes
        if(list.contains(checkOperatingSystems.getText().toString().trim())){
            checkOperatingSystems.setSelected(true);
        }
        
        // Physics
        if(list.contains(checkPhysics.getText().toString().trim())){
            checkPhysics.setSelected(true);
        }
        
        // Space Sciences
        if(list.contains(checkSpaceSciences.getText().toString().trim())){
            checkSpaceSciences.setSelected(true);
        }
        
        // Topology
        if(list.contains(checkTopology.getText().toString().trim())){
            checkTopology.setSelected(true);
        }
        
        // Analytical Chemistry
        if(list.contains(checkAnalyticalChemistry.getText().toString().trim())){
            checkAnalyticalChemistry.setSelected(true);
        }
        
        // Artificial Intelligence
        if(list.contains(checkArtificialIntelligenece.getText().toString().trim())){
            checkArtificialIntelligenece.setSelected(true);
        }
        
        // Biology
        if(list.contains(checkBiology.getText().toString().trim())){
            checkBiology.setSelected(true);
        }
        
        // Code
        if(list.contains(checkCode.getText().toString().trim())){
            checkCode.setSelected(true);
        }
        
        // Computer Graphics
        if(list.contains(checkComputerGraphics.getText().toString().trim())){
            checkComputerGraphics.setSelected(true);
        }
        
        // Data Structures
        if(list.contains(checkDataStructures.getText().toString().trim())){
            checkDataStructures.setSelected(true);
        }
        
        // Ecology
        if(list.contains(checkEcology.getText().toString().trim())){
            checkEcology.setSelected(true);
        }
        
        // Game Theory
        if(list.contains(checkGameTheory.getText().toString().trim())){
            checkGameTheory.setSelected(true);
        }
        
        // Geometry
        if(list.contains(checkGeometry.getText().toString().trim())){
            checkGeometry.setSelected(true);
        }
        
        // Information Theory
        if(list.contains(checkInformationTheory.getText().toString().trim())){
            checkInformationTheory.setSelected(true);
        }
        
        // Mathematical Physics
        if(list.contains(checkMathematicalPhysics.getText().toString().trim())){
            checkMathematicalPhysics.setSelected(true);
        }
        
        // Nutrition
        if(list.contains(checkNutrition.getText().toString().trim())){
            checkNutrition.setSelected(true);
        }
        
        // Physical Chemistry
        if(list.contains(checkPhysicalChemistry.getText().toString().trim())){
            checkPhysicalChemistry.setSelected(true);
        }
        
        // Quantum Computing
        if(list.contains(checkQuantumComputing.getText().toString().trim())){
            checkQuantumComputing.setSelected(true);
        }
        
        // Theory Computation
        if(list.contains(checkTheoryComputation.getText().toString().trim())){
            checkTheoryComputation.setSelected(true);
        }
        
        // History
        if(list.contains(checkHistory.getText().toString().trim())){
            checkHistory.setSelected(true);
        }
        
        // Architecture
        if(list.contains(checkArchitecture.getText().toString().trim())){
            checkArchitecture.setSelected(true);
        }
        
        // Asian History
        if(list.contains(checkAsianHistory.getText().toString().trim())){
            checkAsianHistory.setSelected(true);
        }
        
        // Dance
        if(list.contains(checkDance.getText().toString().trim())){
            checkDance.setSelected(true);
        }
        
        // History Culture
        if(list.contains(checkHistoryCulture.getText().toString().trim())){
            checkHistoryCulture.setSelected(true);
        }
        
        // Legal Management
        if(list.contains(checkLegalManagement.getText().toString().trim())){
            checkLegalManagement.setSelected(true);
        }
        
        // Performing Arts
        if(list.contains(checkPerformingArts.getText().toString().trim())){
            checkPerformingArts.setSelected(true);
        }
        
        // Television
        if(list.contains(checkTelevision.getText().toString().trim())){
            checkTelevision.setSelected(true);
        }
        
        // World History
        if(list.contains(checkWorldHistory.getText().toString().trim())){
            checkWorldHistory.setSelected(true);
        }
        
        // Administrative Law
        if(list.contains(checkAdministrativeLaw.getText().toString().trim())){
            checkAdministrativeLaw.setSelected(true);
        }
        
        // Applied Arts
        if(list.contains(checkAppliedArts.getText().toString().trim())){
           checkAppliedArts.setSelected(true);
        }
        
        // Civil Law
        if(list.contains(checkCivilLaw.getText().toString().trim())){
            checkCivilLaw.setSelected(true);
        }
        
        // Literature
        if(list.contains(checkLiterature.getText().toString().trim())){
            checkLiterature.setSelected(true);
        }
        
        // History Literature
        if(list.contains(checkHistoryLiterature.getText().toString().trim())){
            checkHistoryLiterature.setSelected(true);
        }
        
        // Linguistics
        if(list.contains(checkLinguistics.getText().toString().trim())){
            checkLinguistics.setSelected(true);
        }
        
        // Phylosophy
        if(list.contains(checkPhylosophy.getText().toString().trim())){
            checkPhylosophy.setSelected(true);
        }
        
        // Theatre
        if(list.contains(checkTheatre.getText().toString().trim())){
            checkTheatre.setSelected(true);
        }
        
        
        // World Literature
        if(list.contains(checkWorldLiterature.getText().toString().trim())){
           checkWorldLiterature.setSelected(true);
        }
        
        // Nursing
        if(list.contains(checkNursing.getText().toString().trim())){
            checkNursing.setSelected(true);
        }
        
        // Analysis Structures
        if(list.contains(checkAnalysisStructures.getText().toString().trim())){
            checkAnalysisStructures.setSelected(true);
        }
        
        // Building Materials Theory
        if(list.contains(checkBuildingMaterialsTheory.getText().toString().trim())){
            checkBuildingMaterialsTheory.setSelected(true);
        }
        
        // Capital Markets
        if(list.contains(checkCapitalMarkets.getText().toString().trim())){
            checkCapitalMarkets.setSelected(true);
        }
        
        // Clinical Physiology
        if(list.contains(checkClinicalPhysiology.getText().toString().trim())){
            checkClinicalPhysiology.setSelected(true);
        }
        
        // Econometrics
        if(list.contains(checkEconometrics.getText().toString().trim())){
            checkEconometrics.setSelected(true);
        }
        
        // Entrepreneurship
        if(list.contains(checkEntrepreneurship.getText().toString().trim())){
            checkEntrepreneurship.setSelected(true);
        }
        
        // Food Agribusiness
        if(list.contains(checkFoodAgribusiness.getText().toString().trim())){
            checkFoodAgribusiness.setSelected(true);
        }
        
        // Human Resource
        if(list.contains(checkHumanResource.getText().toString().trim())){
            checkHumanResource.setSelected(true);
        }
        
        // Macroeconomics
        if(list.contains(checkMacroeconomics.getText().toString().trim())){
            checkMacroeconomics.setSelected(true);
        }
        
        // Medicine Health
        if(list.contains(checkMedicineHealth.getText().toString().trim())){
            checkMedicineHealth.setSelected(true);
        }
        
        // Pharmacology
        if(list.contains(checkPharmacology.getText().toString().trim())){
            checkPharmacology.setSelected(true);
        }
        
        // Structural design
        if(list.contains(checkStructuralDesign.getText().toString().trim())){
            checkStructuralDesign.setSelected(true);
        }
        
        // Operations management
        if(list.contains(checkOperationsManagement.getText().toString().trim())){
            checkOperationsManagement.setSelected(true);
        }
        
        // Audit
        if(list.contains(checkAudit.getText().toString().trim())){
            checkAudit.setSelected(true);
        }
        
        // Business
        if(list.contains(checkBusiness.getText().toString().trim())){
            checkBusiness.setSelected(true);
        }
        
        // Chemical Engineering
        if(list.contains(checkChemicalEngineering.getText().toString().trim())){
            checkChemicalEngineering.setSelected(true);
        }
        
        // Cryptocurrencies
        if(list.contains(checkCryptocurrencies.getText().toString().trim())){
            checkCryptocurrencies.setSelected(true);
        }
        
        // Educational Technology
        if(list.contains(checkEducationalTechnology.getText().toString().trim())){
            checkEducationalTechnology.setSelected(true);
        }
        
        // Environmental sciences
        if(list.contains(checkEnvironmentalSciences.getText().toString().trim())){
            checkEnvironmentalSciences.setSelected(true);
        }
        
        // Hydrology Hydrolic Systems
        if(list.contains(checkHydrologyHydrolicSystems.getText().toString().trim())){
            checkHydrologyHydrolicSystems.setSelected(true);
        }
        
        // Management studies
        if(list.contains(checkManagementStudies.getText().toString().trim())){
            checkManagementStudies.setSelected(true);
        }
        
        // Microeconomics
        if(list.contains(checkMicroeconomics.getText().toString().trim())){
            checkMicroeconomics.setSelected(true);
        }
        
        //Physical Education
        if(list.contains(checkPhysicalEducation.getText().toString().trim())){
            checkPhysicalEducation.setSelected(true);
        }
        
        // Business Entertainment
        if(list.contains(checkBusinessEntertainment.getText().toString().trim())){
            checkBusinessEntertainment.setSelected(true);
        }
        
        // Political science
        if(list.contains(checkPoliticalScience.getText().toString().trim())){
            checkPoliticalScience.setSelected(true);
        }
        
        // Archaeology
        if(list.contains(checkArchaeology.getText().toString().trim())){
            checkArchaeology.setSelected(true);
        }
        
        // Education
        if(list.contains(checkEducation.getText().toString().trim())){
            checkEducation.setSelected(true);
        }
        
        // Economics
        if(list.contains(checkEconomics.getText().toString().trim())){
            checkEconomics.setSelected(true);
        }
        
        // Anthropology
        if(list.contains(checkAnthropology.getText().toString().trim())){
            checkAnthropology.setSelected(true);
        }
        
        // Cultural studies
        if(list.contains(checkCulturalStudies.getText().toString().trim())){
            checkCulturalStudies.setSelected(true);
        }
        // Tourism
        if(list.contains(checkTourism.getText().toString().trim())){
            checkTourism.setSelected(true);
        }
        
        // Analysis
        if(list.contains(checkAnalysis.getText().toString().trim())){
            checkAnalysis.setSelected(true);
        }
        
        // Approximation theory
        if(list.contains(checkApproximationTheory.getText().toString().trim())){
            checkApproximationTheory.setSelected(true);
        }
        
        // Biochemistry
        if(list.contains(checkBiochemistry.getText().toString().trim())){
            checkBiochemistry.setSelected(true);
        }
        
        // Chemistry
        if(list.contains(checkChemistry.getText().toString().trim())){
            checkChemistry.setSelected(true);
        }
        
        // Computer communications
        if(list.contains(checkComputerCommunications.getText().toString().trim())){
            checkComputerCommunications.setSelected(true);
        }
        
        // Cryptography
        if(list.contains(checkCryptography.getText().toString().trim())){
            checkCryptography.setSelected(true);
        }
        
        // Earth Science
        if(list.contains(checkEarthScience.getText().toString().trim())){
            checkEarthScience.setSelected(true);
        }
        
        // Geology
        if(list.contains(checkGeology.getText().toString().trim())){
            checkGeology.setSelected(true);
        }
        
        // Immunology
        if(list.contains(checkImmunology.getText().toString().trim())){
            checkImmunology.setSelected(true);
        }
        
        // Mathematical logic
        if(list.contains(checkMathematicalLogic.getText().toString().trim())){
            checkMathematicalLogic.setSelected(true);
        }
        
        // Numerical analysis
        if(list.contains(checkNumericalAnalysis.getText().toString().trim())){
            checkNumericalAnalysis.setSelected(true);
        }
        
        // Organic chemistry
        if(list.contains(checkOrganicChemistry.getText().toString().trim())){
            checkOrganicChemistry.setSelected(true);
        }
        
        // Programming Languages
        if(list.contains(checkProgrammingLanguages.getText().toString().trim())){
            checkProgrammingLanguages.setSelected(true);
        }
        
        // Theoretical physics
        if(list.contains(checkTheoreticalPhysics.getText().toString().trim())){
            checkTheoreticalPhysics.setSelected(true);
        }
        
        // Algorithms
        if(list.contains(checkAlgorithms.getText().toString().trim())){
            checkAlgorithms.setSelected(true);
        }
        
        // Applied Physics
        if(list.contains(checkAppliedPhysics.getText().toString().trim())){
            checkAppliedPhysics.setSelected(true);
        }
        
        // Astrophysics
        if(list.contains(checkAstrophysics.getText().toString().trim())){
            checkAstrophysics.setSelected(true);
        }
        
        // Evolutionary Biology
        if(list.contains(checkEvolutionaryBiology.getText().toString().trim())){
            checkEvolutionaryBiology.setSelected(true);
        }
        
        // Computer Architecture
        if(list.contains(checkComputerArchitecture.getText().toString().trim())){
            checkComputerArchitecture.setSelected(true);
        }
        
        // Computer security
        if(list.contains(checkComputerSecurity.getText().toString().trim())){
            checkComputerSecurity.setSelected(true);
        }
        
        // Dynamical systems
        if(list.contains(checkGeneralChemistry.getText().toString().trim())){
            checkGeneralChemistry.setSelected(true);
        }
        
        // General chemistry
        if(list.contains(checkGeneralChemistry.getText().toString().trim())){
            checkGeneralChemistry.setSelected(true);
        }
        
        // Human Computer Interaction
        if(list.contains(checkHumanComputerInteraction.getText().toString().trim())){
            checkHumanComputerInteraction.setSelected(true);
        }
        
        // Logic in computer science
        if(list.contains(checkLogicComputerScience.getText().toString().trim())){
            checkLogicComputerScience.setSelected(true);
        }
        
        // Operations research
        if(list.contains(checkOperationsResearch.getText().toString().trim())){
            checkOperationsResearch.setSelected(true);
        }
        
        // Number Theory
        if(list.contains(checkNumberTheory.getText().toString().trim())){
            checkNumberTheory.setSelected(true);
        }
        
        // Statistics
        if(list.contains(checkStatistics.getText().toString().trim())){
           checkStatistics.setSelected(true);
        }
        
        // Probability theory
        if(list.contains(checkProbabilityTheory.getText().toString().trim())){
            checkProbabilityTheory.setSelected(true);
        }
        
        // Zoology
        if(list.contains(checkZoology.getText().toString().trim())){
            checkZoology.setSelected(true);
        }
            
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        settings_btnBack = new javax.swing.JButton();
        subjects_btnSave = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        checkEnglishLanguage = new javax.swing.JCheckBox();
        checkAfricanHistory = new javax.swing.JCheckBox();
        checkArtDesign = new javax.swing.JCheckBox();
        checkCreativeWriting = new javax.swing.JCheckBox();
        checkJurisprudence = new javax.swing.JCheckBox();
        checkModernHistory = new javax.swing.JCheckBox();
        checkPoetry = new javax.swing.JCheckBox();
        checkTheology = new javax.swing.JCheckBox();
        checkAmericanHistory = new javax.swing.JCheckBox();
        checkAncientHistory = new javax.swing.JCheckBox();
        checkArtHistory = new javax.swing.JCheckBox();
        checkCriminalLaw = new javax.swing.JCheckBox();
        checkFilm = new javax.swing.JCheckBox();
        checkHistory = new javax.swing.JCheckBox();
        checkArchitecture = new javax.swing.JCheckBox();
        checkAsianHistory = new javax.swing.JCheckBox();
        checkDance = new javax.swing.JCheckBox();
        checkHistoryCulture = new javax.swing.JCheckBox();
        checkLegalManagement = new javax.swing.JCheckBox();
        checkPerformingArts = new javax.swing.JCheckBox();
        checkTelevision = new javax.swing.JCheckBox();
        checkWorldHistory = new javax.swing.JCheckBox();
        checkAdministrativeLaw = new javax.swing.JCheckBox();
        checkAppliedArts = new javax.swing.JCheckBox();
        checkCivilLaw = new javax.swing.JCheckBox();
        checkLiterature = new javax.swing.JCheckBox();
        checkWorldLiterature = new javax.swing.JCheckBox();
        checkTheatre = new javax.swing.JCheckBox();
        checkPhylosophy = new javax.swing.JCheckBox();
        checkLinguistics = new javax.swing.JCheckBox();
        checkHistoryLiterature = new javax.swing.JCheckBox();
        checkAll = new javax.swing.JCheckBox();
        checkLaw = new javax.swing.JCheckBox();
        checkMusic = new javax.swing.JCheckBox();
        checkRussianHistory = new javax.swing.JCheckBox();
        checkVisualArts = new javax.swing.JCheckBox();
        checkOther = new javax.swing.JCheckBox();
        checkAccounting = new javax.swing.JCheckBox();
        checkBlockchain = new javax.swing.JCheckBox();
        checkBusinessAnalysis = new javax.swing.JCheckBox();
        checkChildcare = new javax.swing.JCheckBox();
        checkDentistry = new javax.swing.JCheckBox();
        checkRealProperty = new javax.swing.JCheckBox();
        checkMoneyBanking = new javax.swing.JCheckBox();
        checkMaterialsScienceEngineering = new javax.swing.JCheckBox();
        checkInvestmentStrategies = new javax.swing.JCheckBox();
        checkHealthCare = new javax.swing.JCheckBox();
        checkElectricalEngineering = new javax.swing.JCheckBox();
        checkDigitalInnovationTransformation = new javax.swing.JCheckBox();
        checkCivilEngineering = new javax.swing.JCheckBox();
        checkBusinessManagement = new javax.swing.JCheckBox();
        checkBrandValue = new javax.swing.JCheckBox();
        checkAdvertising = new javax.swing.JCheckBox();
        checkMarketing = new javax.swing.JCheckBox();
        checkFluidMechanics = new javax.swing.JCheckBox();
        checkEngineering = new javax.swing.JCheckBox();
        checkAppliedMathematics = new javax.swing.JCheckBox();
        checkAlgebra = new javax.swing.JCheckBox();
        checkHumanGeography = new javax.swing.JCheckBox();
        checkCommunicationStudies = new javax.swing.JCheckBox();
        checkPsychology = new javax.swing.JCheckBox();
        checkHumanRights = new javax.swing.JCheckBox();
        checkCriminology = new javax.swing.JCheckBox();
        checkSocialWork = new javax.swing.JCheckBox();
        checkSociology = new javax.swing.JCheckBox();
        checkStrategyTechnology = new javax.swing.JCheckBox();
        checkNegotiation = new javax.swing.JCheckBox();
        checkMechanicalEngineering = new javax.swing.JCheckBox();
        checkLogistics = new javax.swing.JCheckBox();
        checkHospitality = new javax.swing.JCheckBox();
        checkAnalyticalChemistry = new javax.swing.JCheckBox();
        checkTopology = new javax.swing.JCheckBox();
        checkSpaceSciences = new javax.swing.JCheckBox();
        checkPhysics = new javax.swing.JCheckBox();
        checkOperatingSystems = new javax.swing.JCheckBox();
        checkMathematics = new javax.swing.JCheckBox();
        checkInorganicChemestry = new javax.swing.JCheckBox();
        checkGraphTheory = new javax.swing.JCheckBox();
        checkGeneralBiology = new javax.swing.JCheckBox();
        checkEnvironmentalChemistry = new javax.swing.JCheckBox();
        checkDistributedComputing = new javax.swing.JCheckBox();
        checkComputerScience = new javax.swing.JCheckBox();
        checkCombinatorics = new javax.swing.JCheckBox();
        checkCellBiology = new javax.swing.JCheckBox();
        checkAstronomy = new javax.swing.JCheckBox();
        checkQuantumComputing = new javax.swing.JCheckBox();
        checkPhysicalChemistry = new javax.swing.JCheckBox();
        checkNutrition = new javax.swing.JCheckBox();
        checkMathematicalPhysics = new javax.swing.JCheckBox();
        checkInformationTheory = new javax.swing.JCheckBox();
        checkGeometry = new javax.swing.JCheckBox();
        checkGameTheory = new javax.swing.JCheckBox();
        checkEcology = new javax.swing.JCheckBox();
        checkDataStructures = new javax.swing.JCheckBox();
        checkComputerGraphics = new javax.swing.JCheckBox();
        checkCode = new javax.swing.JCheckBox();
        checkBiology = new javax.swing.JCheckBox();
        checkArtificialIntelligenece = new javax.swing.JCheckBox();
        checkTheoryComputation = new javax.swing.JCheckBox();
        checkNursing = new javax.swing.JCheckBox();
        checkAnalysisStructures = new javax.swing.JCheckBox();
        checkChemicalEngineering = new javax.swing.JCheckBox();
        checkBusiness = new javax.swing.JCheckBox();
        checkAudit = new javax.swing.JCheckBox();
        checkOperationsManagement = new javax.swing.JCheckBox();
        checkStructuralDesign = new javax.swing.JCheckBox();
        checkPharmacology = new javax.swing.JCheckBox();
        checkMedicineHealth = new javax.swing.JCheckBox();
        checkMacroeconomics = new javax.swing.JCheckBox();
        checkHumanResource = new javax.swing.JCheckBox();
        checkFoodAgribusiness = new javax.swing.JCheckBox();
        checkEntrepreneurship = new javax.swing.JCheckBox();
        checkEconometrics = new javax.swing.JCheckBox();
        checkClinicalPhysiology = new javax.swing.JCheckBox();
        checkCapitalMarkets = new javax.swing.JCheckBox();
        checkBuildingMaterialsTheory = new javax.swing.JCheckBox();
        checkCulturalStudies = new javax.swing.JCheckBox();
        checkAnthropology = new javax.swing.JCheckBox();
        checkEconomics = new javax.swing.JCheckBox();
        checkEducation = new javax.swing.JCheckBox();
        checkArchaeology = new javax.swing.JCheckBox();
        checkPoliticalScience = new javax.swing.JCheckBox();
        checkBusinessEntertainment = new javax.swing.JCheckBox();
        checkPhysicalEducation = new javax.swing.JCheckBox();
        checkMicroeconomics = new javax.swing.JCheckBox();
        checkManagementStudies = new javax.swing.JCheckBox();
        checkHydrologyHydrolicSystems = new javax.swing.JCheckBox();
        checkEnvironmentalSciences = new javax.swing.JCheckBox();
        checkEducationalTechnology = new javax.swing.JCheckBox();
        checkCryptocurrencies = new javax.swing.JCheckBox();
        checkOrganicChemistry = new javax.swing.JCheckBox();
        checkNumericalAnalysis = new javax.swing.JCheckBox();
        checkMathematicalLogic = new javax.swing.JCheckBox();
        checkImmunology = new javax.swing.JCheckBox();
        checkGeology = new javax.swing.JCheckBox();
        checkEarthScience = new javax.swing.JCheckBox();
        checkCryptography = new javax.swing.JCheckBox();
        checkComputerCommunications = new javax.swing.JCheckBox();
        checkChemistry = new javax.swing.JCheckBox();
        checkBiochemistry = new javax.swing.JCheckBox();
        checkApproximationTheory = new javax.swing.JCheckBox();
        checkAnalysis = new javax.swing.JCheckBox();
        checkTourism = new javax.swing.JCheckBox();
        checkGeneralChemistry = new javax.swing.JCheckBox();
        checkDynamicalSystems = new javax.swing.JCheckBox();
        checkComputerSecurity = new javax.swing.JCheckBox();
        checkComputerArchitecture = new javax.swing.JCheckBox();
        checkEvolutionaryBiology = new javax.swing.JCheckBox();
        checkAstrophysics = new javax.swing.JCheckBox();
        checkAppliedPhysics = new javax.swing.JCheckBox();
        checkAlgorithms = new javax.swing.JCheckBox();
        checkTheoreticalPhysics = new javax.swing.JCheckBox();
        checkProgrammingLanguages = new javax.swing.JCheckBox();
        checkHumanComputerInteraction = new javax.swing.JCheckBox();
        checkLogicComputerScience = new javax.swing.JCheckBox();
        checkOperationsResearch = new javax.swing.JCheckBox();
        checkNumberTheory = new javax.swing.JCheckBox();
        checkStatistics = new javax.swing.JCheckBox();
        checkProbabilityTheory = new javax.swing.JCheckBox();
        checkZoology = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        btnExit1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnExit2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(19, 28, 59));
        jPanel2.setPreferredSize(new java.awt.Dimension(478, 300));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        settings_btnBack.setBackground(new java.awt.Color(28, 39, 84));
        settings_btnBack.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        settings_btnBack.setForeground(new java.awt.Color(255, 255, 255));
        settings_btnBack.setText("BACK");
        settings_btnBack.setBorderPainted(false);
        settings_btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settings_btnBackActionPerformed(evt);
            }
        });

        subjects_btnSave.setBackground(new java.awt.Color(28, 39, 84));
        subjects_btnSave.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        subjects_btnSave.setForeground(new java.awt.Color(255, 255, 255));
        subjects_btnSave.setText("SAVE");
        subjects_btnSave.setBorderPainted(false);
        subjects_btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjects_btnSaveActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(19, 28, 59));

        jPanel3.setBackground(new java.awt.Color(19, 28, 59));
        jPanel3.setPreferredSize(new java.awt.Dimension(450, 1950));
        jPanel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel3MouseDragged(evt);
            }
        });
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel3MousePressed(evt);
            }
        });

        checkEnglishLanguage.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEnglishLanguage.setForeground(new java.awt.Color(255, 255, 255));
        checkEnglishLanguage.setText("English Language");

        checkAfricanHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAfricanHistory.setForeground(new java.awt.Color(255, 255, 255));
        checkAfricanHistory.setText("African History");

        checkArtDesign.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkArtDesign.setForeground(new java.awt.Color(255, 255, 255));
        checkArtDesign.setText("Art & Design");

        checkCreativeWriting.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCreativeWriting.setForeground(new java.awt.Color(255, 255, 255));
        checkCreativeWriting.setText("Creative Writing");

        checkJurisprudence.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkJurisprudence.setForeground(new java.awt.Color(255, 255, 255));
        checkJurisprudence.setText("Jurisprudence (Phylosophy of Law)");

        checkModernHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkModernHistory.setForeground(new java.awt.Color(255, 255, 255));
        checkModernHistory.setText("Modern History");

        checkPoetry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPoetry.setForeground(new java.awt.Color(255, 255, 255));
        checkPoetry.setText("Poetry");

        checkTheology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkTheology.setForeground(new java.awt.Color(255, 255, 255));
        checkTheology.setText("Theology");

        checkAmericanHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAmericanHistory.setForeground(new java.awt.Color(255, 255, 255));
        checkAmericanHistory.setText("American History");

        checkAncientHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAncientHistory.setForeground(new java.awt.Color(255, 255, 255));
        checkAncientHistory.setText("Ancient History");

        checkArtHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkArtHistory.setForeground(new java.awt.Color(255, 255, 255));
        checkArtHistory.setText("Art History");

        checkCriminalLaw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCriminalLaw.setForeground(new java.awt.Color(255, 255, 255));
        checkCriminalLaw.setText("Criminal Law");

        checkFilm.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkFilm.setForeground(new java.awt.Color(255, 255, 255));
        checkFilm.setText("Film");

        checkHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHistory.setForeground(new java.awt.Color(255, 255, 255));
        checkHistory.setText("History");

        checkArchitecture.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkArchitecture.setForeground(new java.awt.Color(255, 255, 255));
        checkArchitecture.setText("Architecture");

        checkAsianHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAsianHistory.setForeground(new java.awt.Color(255, 255, 255));
        checkAsianHistory.setText("Asian History");

        checkDance.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkDance.setForeground(new java.awt.Color(255, 255, 255));
        checkDance.setText("Dance");

        checkHistoryCulture.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHistoryCulture.setForeground(new java.awt.Color(255, 255, 255));
        checkHistoryCulture.setText("History of Culture");

        checkLegalManagement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLegalManagement.setForeground(new java.awt.Color(255, 255, 255));
        checkLegalManagement.setText("Legal Management");

        checkPerformingArts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPerformingArts.setForeground(new java.awt.Color(255, 255, 255));
        checkPerformingArts.setText("Performing arts");

        checkTelevision.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkTelevision.setForeground(new java.awt.Color(255, 255, 255));
        checkTelevision.setText("Television");

        checkWorldHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkWorldHistory.setForeground(new java.awt.Color(255, 255, 255));
        checkWorldHistory.setText("World History");

        checkAdministrativeLaw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAdministrativeLaw.setForeground(new java.awt.Color(255, 255, 255));
        checkAdministrativeLaw.setText("Administrative Law");

        checkAppliedArts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAppliedArts.setForeground(new java.awt.Color(255, 255, 255));
        checkAppliedArts.setText("Applied Arts");

        checkCivilLaw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCivilLaw.setForeground(new java.awt.Color(255, 255, 255));
        checkCivilLaw.setText("Civil law");

        checkLiterature.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLiterature.setForeground(new java.awt.Color(255, 255, 255));
        checkLiterature.setText("Literature");

        checkWorldLiterature.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkWorldLiterature.setForeground(new java.awt.Color(255, 255, 255));
        checkWorldLiterature.setText("World Literature");

        checkTheatre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkTheatre.setForeground(new java.awt.Color(255, 255, 255));
        checkTheatre.setText("Theatre");

        checkPhylosophy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPhylosophy.setForeground(new java.awt.Color(255, 255, 255));
        checkPhylosophy.setText("Phylosophy");

        checkLinguistics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLinguistics.setForeground(new java.awt.Color(255, 255, 255));
        checkLinguistics.setText("Linguistics");

        checkHistoryLiterature.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHistoryLiterature.setForeground(new java.awt.Color(255, 255, 255));
        checkHistoryLiterature.setText("History of Literature");

        checkAll.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAll.setForeground(new java.awt.Color(255, 255, 255));
        checkAll.setText("All");
        checkAll.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                checkAllItemStateChanged(evt);
            }
        });
        checkAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllActionPerformed(evt);
            }
        });

        checkLaw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLaw.setForeground(new java.awt.Color(255, 255, 255));
        checkLaw.setText("Law");

        checkMusic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMusic.setForeground(new java.awt.Color(255, 255, 255));
        checkMusic.setText("Music");

        checkRussianHistory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkRussianHistory.setForeground(new java.awt.Color(255, 255, 255));
        checkRussianHistory.setText("Russian History");

        checkVisualArts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkVisualArts.setForeground(new java.awt.Color(255, 255, 255));
        checkVisualArts.setText("Visual Arts");

        checkOther.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkOther.setForeground(new java.awt.Color(255, 255, 255));
        checkOther.setText("Other");

        checkAccounting.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAccounting.setForeground(new java.awt.Color(255, 255, 255));
        checkAccounting.setText("Accounting");

        checkBlockchain.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBlockchain.setForeground(new java.awt.Color(255, 255, 255));
        checkBlockchain.setText("Blockchain");

        checkBusinessAnalysis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBusinessAnalysis.setForeground(new java.awt.Color(255, 255, 255));
        checkBusinessAnalysis.setText("Business Analysis");

        checkChildcare.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkChildcare.setForeground(new java.awt.Color(255, 255, 255));
        checkChildcare.setText("Childcare");

        checkDentistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkDentistry.setForeground(new java.awt.Color(255, 255, 255));
        checkDentistry.setText("Dentistry");

        checkRealProperty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkRealProperty.setForeground(new java.awt.Color(255, 255, 255));
        checkRealProperty.setText("Real Property");

        checkMoneyBanking.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMoneyBanking.setForeground(new java.awt.Color(255, 255, 255));
        checkMoneyBanking.setText("Money and Banking");

        checkMaterialsScienceEngineering.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMaterialsScienceEngineering.setForeground(new java.awt.Color(255, 255, 255));
        checkMaterialsScienceEngineering.setText("Materials Science and Engineering");

        checkInvestmentStrategies.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkInvestmentStrategies.setForeground(new java.awt.Color(255, 255, 255));
        checkInvestmentStrategies.setText("Investment Strategies");

        checkHealthCare.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHealthCare.setForeground(new java.awt.Color(255, 255, 255));
        checkHealthCare.setText("Health Care");

        checkElectricalEngineering.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkElectricalEngineering.setForeground(new java.awt.Color(255, 255, 255));
        checkElectricalEngineering.setText("Electrical Engineering");

        checkDigitalInnovationTransformation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkDigitalInnovationTransformation.setForeground(new java.awt.Color(255, 255, 255));
        checkDigitalInnovationTransformation.setText("Digital Innovation and Transformation");

        checkCivilEngineering.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCivilEngineering.setForeground(new java.awt.Color(255, 255, 255));
        checkCivilEngineering.setText("Civil Engineering");

        checkBusinessManagement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBusinessManagement.setForeground(new java.awt.Color(255, 255, 255));
        checkBusinessManagement.setText("Business management");

        checkBrandValue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBrandValue.setForeground(new java.awt.Color(255, 255, 255));
        checkBrandValue.setText("Brand Value");

        checkAdvertising.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAdvertising.setForeground(new java.awt.Color(255, 255, 255));
        checkAdvertising.setText("Advertising");

        checkMarketing.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMarketing.setForeground(new java.awt.Color(255, 255, 255));
        checkMarketing.setText("Marketing");

        checkFluidMechanics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkFluidMechanics.setForeground(new java.awt.Color(255, 255, 255));
        checkFluidMechanics.setText("Fluid Mechanics");

        checkEngineering.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEngineering.setForeground(new java.awt.Color(255, 255, 255));
        checkEngineering.setText("Engineering");

        checkAppliedMathematics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAppliedMathematics.setForeground(new java.awt.Color(255, 255, 255));
        checkAppliedMathematics.setText("Applied mathematics");

        checkAlgebra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAlgebra.setForeground(new java.awt.Color(255, 255, 255));
        checkAlgebra.setText("Algebra");

        checkHumanGeography.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHumanGeography.setForeground(new java.awt.Color(255, 255, 255));
        checkHumanGeography.setText("Human geography");

        checkCommunicationStudies.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCommunicationStudies.setForeground(new java.awt.Color(255, 255, 255));
        checkCommunicationStudies.setText("Communication Studies");

        checkPsychology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPsychology.setForeground(new java.awt.Color(255, 255, 255));
        checkPsychology.setText("Psychology");

        checkHumanRights.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHumanRights.setForeground(new java.awt.Color(255, 255, 255));
        checkHumanRights.setText("Human Rights");

        checkCriminology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCriminology.setForeground(new java.awt.Color(255, 255, 255));
        checkCriminology.setText("Criminology");

        checkSocialWork.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkSocialWork.setForeground(new java.awt.Color(255, 255, 255));
        checkSocialWork.setText("Social work");

        checkSociology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkSociology.setForeground(new java.awt.Color(255, 255, 255));
        checkSociology.setText("Sociology");

        checkStrategyTechnology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkStrategyTechnology.setForeground(new java.awt.Color(255, 255, 255));
        checkStrategyTechnology.setText("Strategy and Technology");

        checkNegotiation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkNegotiation.setForeground(new java.awt.Color(255, 255, 255));
        checkNegotiation.setText("Negotiation");

        checkMechanicalEngineering.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMechanicalEngineering.setForeground(new java.awt.Color(255, 255, 255));
        checkMechanicalEngineering.setText("Mechanical Engineering");

        checkLogistics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLogistics.setForeground(new java.awt.Color(255, 255, 255));
        checkLogistics.setText("Logistics");

        checkHospitality.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHospitality.setForeground(new java.awt.Color(255, 255, 255));
        checkHospitality.setText("Hospitality");

        checkAnalyticalChemistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAnalyticalChemistry.setForeground(new java.awt.Color(255, 255, 255));
        checkAnalyticalChemistry.setText("Analytical Chemistry");

        checkTopology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkTopology.setForeground(new java.awt.Color(255, 255, 255));
        checkTopology.setText("Topology");

        checkSpaceSciences.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkSpaceSciences.setForeground(new java.awt.Color(255, 255, 255));
        checkSpaceSciences.setText("Space sciences");

        checkPhysics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPhysics.setForeground(new java.awt.Color(255, 255, 255));
        checkPhysics.setText("Physics");

        checkOperatingSystems.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkOperatingSystems.setForeground(new java.awt.Color(255, 255, 255));
        checkOperatingSystems.setText("Operating systems");

        checkMathematics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMathematics.setForeground(new java.awt.Color(255, 255, 255));
        checkMathematics.setText("Mathematics");

        checkInorganicChemestry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkInorganicChemestry.setForeground(new java.awt.Color(255, 255, 255));
        checkInorganicChemestry.setText("Inorganic Chemestry");

        checkGraphTheory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkGraphTheory.setForeground(new java.awt.Color(255, 255, 255));
        checkGraphTheory.setText("Graph Theory");

        checkGeneralBiology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkGeneralBiology.setForeground(new java.awt.Color(255, 255, 255));
        checkGeneralBiology.setText("General Biology");

        checkEnvironmentalChemistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEnvironmentalChemistry.setForeground(new java.awt.Color(255, 255, 255));
        checkEnvironmentalChemistry.setText("Environmental Chemistry");

        checkDistributedComputing.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkDistributedComputing.setForeground(new java.awt.Color(255, 255, 255));
        checkDistributedComputing.setText("Distributed Computing");

        checkComputerScience.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkComputerScience.setForeground(new java.awt.Color(255, 255, 255));
        checkComputerScience.setText("Computer Science");

        checkCombinatorics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCombinatorics.setForeground(new java.awt.Color(255, 255, 255));
        checkCombinatorics.setText("Combinatorics");

        checkCellBiology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCellBiology.setForeground(new java.awt.Color(255, 255, 255));
        checkCellBiology.setText("Cell Biology");

        checkAstronomy.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAstronomy.setForeground(new java.awt.Color(255, 255, 255));
        checkAstronomy.setText("Astronomy");

        checkQuantumComputing.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkQuantumComputing.setForeground(new java.awt.Color(255, 255, 255));
        checkQuantumComputing.setText("Quantum computing");

        checkPhysicalChemistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPhysicalChemistry.setForeground(new java.awt.Color(255, 255, 255));
        checkPhysicalChemistry.setText("Physical Chemistry");

        checkNutrition.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkNutrition.setForeground(new java.awt.Color(255, 255, 255));
        checkNutrition.setText("Nutrition");

        checkMathematicalPhysics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMathematicalPhysics.setForeground(new java.awt.Color(255, 255, 255));
        checkMathematicalPhysics.setText("Mathematical physics");

        checkInformationTheory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkInformationTheory.setForeground(new java.awt.Color(255, 255, 255));
        checkInformationTheory.setText("Information theory");

        checkGeometry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkGeometry.setForeground(new java.awt.Color(255, 255, 255));
        checkGeometry.setText("Geometry");

        checkGameTheory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkGameTheory.setForeground(new java.awt.Color(255, 255, 255));
        checkGameTheory.setText("Game theory");

        checkEcology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEcology.setForeground(new java.awt.Color(255, 255, 255));
        checkEcology.setText("Ecology");

        checkDataStructures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkDataStructures.setForeground(new java.awt.Color(255, 255, 255));
        checkDataStructures.setText("Data structures");

        checkComputerGraphics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkComputerGraphics.setForeground(new java.awt.Color(255, 255, 255));
        checkComputerGraphics.setText("Computer graphics");

        checkCode.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCode.setForeground(new java.awt.Color(255, 255, 255));
        checkCode.setText("Code");

        checkBiology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBiology.setForeground(new java.awt.Color(255, 255, 255));
        checkBiology.setText("Biology");

        checkArtificialIntelligenece.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkArtificialIntelligenece.setForeground(new java.awt.Color(255, 255, 255));
        checkArtificialIntelligenece.setText("Artificial intelligence");

        checkTheoryComputation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkTheoryComputation.setForeground(new java.awt.Color(255, 255, 255));
        checkTheoryComputation.setText("Theory of computation");

        checkNursing.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkNursing.setForeground(new java.awt.Color(255, 255, 255));
        checkNursing.setText("Nursing");

        checkAnalysisStructures.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAnalysisStructures.setForeground(new java.awt.Color(255, 255, 255));
        checkAnalysisStructures.setText("Analysis of structures");

        checkChemicalEngineering.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkChemicalEngineering.setForeground(new java.awt.Color(255, 255, 255));
        checkChemicalEngineering.setText("Chemical Engineering");

        checkBusiness.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBusiness.setForeground(new java.awt.Color(255, 255, 255));
        checkBusiness.setText("Business");

        checkAudit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAudit.setForeground(new java.awt.Color(255, 255, 255));
        checkAudit.setText("Audit");

        checkOperationsManagement.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkOperationsManagement.setForeground(new java.awt.Color(255, 255, 255));
        checkOperationsManagement.setText("Operations management");

        checkStructuralDesign.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkStructuralDesign.setForeground(new java.awt.Color(255, 255, 255));
        checkStructuralDesign.setText("Structural design");

        checkPharmacology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPharmacology.setForeground(new java.awt.Color(255, 255, 255));
        checkPharmacology.setText("Pharmacology");

        checkMedicineHealth.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMedicineHealth.setForeground(new java.awt.Color(255, 255, 255));
        checkMedicineHealth.setText("Medicine and health");

        checkMacroeconomics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMacroeconomics.setForeground(new java.awt.Color(255, 255, 255));
        checkMacroeconomics.setText("Macroeconomics");

        checkHumanResource.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHumanResource.setForeground(new java.awt.Color(255, 255, 255));
        checkHumanResource.setText("Human resource management");

        checkFoodAgribusiness.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkFoodAgribusiness.setForeground(new java.awt.Color(255, 255, 255));
        checkFoodAgribusiness.setText("Food and Agribusiness");

        checkEntrepreneurship.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEntrepreneurship.setForeground(new java.awt.Color(255, 255, 255));
        checkEntrepreneurship.setText("Entrepreneurship");

        checkEconometrics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEconometrics.setForeground(new java.awt.Color(255, 255, 255));
        checkEconometrics.setText("Econometrics");

        checkClinicalPhysiology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkClinicalPhysiology.setForeground(new java.awt.Color(255, 255, 255));
        checkClinicalPhysiology.setText("Clinical Physiology");

        checkCapitalMarkets.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCapitalMarkets.setForeground(new java.awt.Color(255, 255, 255));
        checkCapitalMarkets.setText("Capital Markets, Investments");

        checkBuildingMaterialsTheory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBuildingMaterialsTheory.setForeground(new java.awt.Color(255, 255, 255));
        checkBuildingMaterialsTheory.setText("Building Materials and Theory");

        checkCulturalStudies.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCulturalStudies.setForeground(new java.awt.Color(255, 255, 255));
        checkCulturalStudies.setText("Cultural studies");

        checkAnthropology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAnthropology.setForeground(new java.awt.Color(255, 255, 255));
        checkAnthropology.setText("Anthropology");

        checkEconomics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEconomics.setForeground(new java.awt.Color(255, 255, 255));
        checkEconomics.setText("Economics");

        checkEducation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEducation.setForeground(new java.awt.Color(255, 255, 255));
        checkEducation.setText("Education");

        checkArchaeology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkArchaeology.setForeground(new java.awt.Color(255, 255, 255));
        checkArchaeology.setText("Archaeology");

        checkPoliticalScience.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPoliticalScience.setForeground(new java.awt.Color(255, 255, 255));
        checkPoliticalScience.setText("Political science");

        checkBusinessEntertainment.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBusinessEntertainment.setForeground(new java.awt.Color(255, 255, 255));
        checkBusinessEntertainment.setText("The Business of Entertainment");

        checkPhysicalEducation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkPhysicalEducation.setForeground(new java.awt.Color(255, 255, 255));
        checkPhysicalEducation.setText("Physical Education");

        checkMicroeconomics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMicroeconomics.setForeground(new java.awt.Color(255, 255, 255));
        checkMicroeconomics.setText("Microeconomics");

        checkManagementStudies.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkManagementStudies.setForeground(new java.awt.Color(255, 255, 255));
        checkManagementStudies.setText("Management studies");

        checkHydrologyHydrolicSystems.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHydrologyHydrolicSystems.setForeground(new java.awt.Color(255, 255, 255));
        checkHydrologyHydrolicSystems.setText("Hydrology and hydrolic systems");

        checkEnvironmentalSciences.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEnvironmentalSciences.setForeground(new java.awt.Color(255, 255, 255));
        checkEnvironmentalSciences.setText("Environmental sciences");

        checkEducationalTechnology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEducationalTechnology.setForeground(new java.awt.Color(255, 255, 255));
        checkEducationalTechnology.setText("Educational Technology");

        checkCryptocurrencies.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCryptocurrencies.setForeground(new java.awt.Color(255, 255, 255));
        checkCryptocurrencies.setText("Cryptocurrencies");

        checkOrganicChemistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkOrganicChemistry.setForeground(new java.awt.Color(255, 255, 255));
        checkOrganicChemistry.setText("Organic chemistry");

        checkNumericalAnalysis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkNumericalAnalysis.setForeground(new java.awt.Color(255, 255, 255));
        checkNumericalAnalysis.setText("Numerical analysis");

        checkMathematicalLogic.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkMathematicalLogic.setForeground(new java.awt.Color(255, 255, 255));
        checkMathematicalLogic.setText("Mathematical logic");

        checkImmunology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkImmunology.setForeground(new java.awt.Color(255, 255, 255));
        checkImmunology.setText("Immunology");

        checkGeology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkGeology.setForeground(new java.awt.Color(255, 255, 255));
        checkGeology.setText("Geology");

        checkEarthScience.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEarthScience.setForeground(new java.awt.Color(255, 255, 255));
        checkEarthScience.setText("Earth Science");

        checkCryptography.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkCryptography.setForeground(new java.awt.Color(255, 255, 255));
        checkCryptography.setText("Cryptography");

        checkComputerCommunications.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkComputerCommunications.setForeground(new java.awt.Color(255, 255, 255));
        checkComputerCommunications.setText("Computer communications");

        checkChemistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkChemistry.setForeground(new java.awt.Color(255, 255, 255));
        checkChemistry.setText("Chemistry");

        checkBiochemistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkBiochemistry.setForeground(new java.awt.Color(255, 255, 255));
        checkBiochemistry.setText("Biochemistry");

        checkApproximationTheory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkApproximationTheory.setForeground(new java.awt.Color(255, 255, 255));
        checkApproximationTheory.setText("Approximation theory");

        checkAnalysis.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAnalysis.setForeground(new java.awt.Color(255, 255, 255));
        checkAnalysis.setText("Analysis");

        checkTourism.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkTourism.setForeground(new java.awt.Color(255, 255, 255));
        checkTourism.setText("Tourism");

        checkGeneralChemistry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkGeneralChemistry.setForeground(new java.awt.Color(255, 255, 255));
        checkGeneralChemistry.setText("General chemistry");

        checkDynamicalSystems.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkDynamicalSystems.setForeground(new java.awt.Color(255, 255, 255));
        checkDynamicalSystems.setText("Dynamical systems");

        checkComputerSecurity.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkComputerSecurity.setForeground(new java.awt.Color(255, 255, 255));
        checkComputerSecurity.setText("Computer security");

        checkComputerArchitecture.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkComputerArchitecture.setForeground(new java.awt.Color(255, 255, 255));
        checkComputerArchitecture.setText("Computer Architecture");

        checkEvolutionaryBiology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkEvolutionaryBiology.setForeground(new java.awt.Color(255, 255, 255));
        checkEvolutionaryBiology.setText("Evolutionary Biology");

        checkAstrophysics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAstrophysics.setForeground(new java.awt.Color(255, 255, 255));
        checkAstrophysics.setText("Astrophysics");

        checkAppliedPhysics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAppliedPhysics.setForeground(new java.awt.Color(255, 255, 255));
        checkAppliedPhysics.setText("Applied Physics");

        checkAlgorithms.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkAlgorithms.setForeground(new java.awt.Color(255, 255, 255));
        checkAlgorithms.setText("Algorithms");

        checkTheoreticalPhysics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkTheoreticalPhysics.setForeground(new java.awt.Color(255, 255, 255));
        checkTheoreticalPhysics.setText("Theoretical physics");

        checkProgrammingLanguages.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkProgrammingLanguages.setForeground(new java.awt.Color(255, 255, 255));
        checkProgrammingLanguages.setText("Programming Languages");

        checkHumanComputerInteraction.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkHumanComputerInteraction.setForeground(new java.awt.Color(255, 255, 255));
        checkHumanComputerInteraction.setText("Human-computer interaction");

        checkLogicComputerScience.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkLogicComputerScience.setForeground(new java.awt.Color(255, 255, 255));
        checkLogicComputerScience.setText("Logic in computer science");

        checkOperationsResearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkOperationsResearch.setForeground(new java.awt.Color(255, 255, 255));
        checkOperationsResearch.setText("Operations research");

        checkNumberTheory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkNumberTheory.setForeground(new java.awt.Color(255, 255, 255));
        checkNumberTheory.setText("Number Theory");

        checkStatistics.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkStatistics.setForeground(new java.awt.Color(255, 255, 255));
        checkStatistics.setText("Statistics");

        checkProbabilityTheory.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkProbabilityTheory.setForeground(new java.awt.Color(255, 255, 255));
        checkProbabilityTheory.setText("Probability theory");

        checkZoology.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        checkZoology.setForeground(new java.awt.Color(255, 255, 255));
        checkZoology.setText("Zoology");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAfricanHistory)
                    .addComponent(checkArtDesign)
                    .addComponent(checkCreativeWriting)
                    .addComponent(checkPoetry)
                    .addComponent(checkTheology)
                    .addComponent(checkAmericanHistory)
                    .addComponent(checkArtHistory)
                    .addComponent(checkAncientHistory)
                    .addComponent(checkCriminalLaw)
                    .addComponent(checkEnglishLanguage)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(checkJurisprudence, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(checkModernHistory))
                    .addComponent(checkFilm)
                    .addComponent(checkLaw)
                    .addComponent(checkMusic)
                    .addComponent(checkRussianHistory)
                    .addComponent(checkVisualArts)
                    .addComponent(checkDentistry)
                    .addComponent(checkChildcare)
                    .addComponent(checkBusinessAnalysis)
                    .addComponent(checkBlockchain)
                    .addComponent(checkOther)
                    .addComponent(checkAccounting)
                    .addComponent(checkFluidMechanics)
                    .addComponent(checkEngineering)
                    .addComponent(checkDigitalInnovationTransformation)
                    .addComponent(checkCivilEngineering)
                    .addComponent(checkBusinessManagement)
                    .addComponent(checkBrandValue)
                    .addComponent(checkMarketing)
                    .addComponent(checkAdvertising)
                    .addComponent(checkRealProperty)
                    .addComponent(checkMoneyBanking)
                    .addComponent(checkMaterialsScienceEngineering)
                    .addComponent(checkInvestmentStrategies)
                    .addComponent(checkElectricalEngineering)
                    .addComponent(checkHealthCare)
                    .addComponent(checkAll)
                    .addComponent(checkTheoryComputation)
                    .addComponent(checkQuantumComputing)
                    .addComponent(checkPhysicalChemistry)
                    .addComponent(checkNutrition)
                    .addComponent(checkMathematicalPhysics)
                    .addComponent(checkInformationTheory)
                    .addComponent(checkGeometry)
                    .addComponent(checkEcology)
                    .addComponent(checkGameTheory)
                    .addComponent(checkDataStructures)
                    .addComponent(checkComputerGraphics)
                    .addComponent(checkCode)
                    .addComponent(checkBiology)
                    .addComponent(checkArtificialIntelligenece)
                    .addComponent(checkAnalyticalChemistry)
                    .addComponent(checkTopology)
                    .addComponent(checkSpaceSciences)
                    .addComponent(checkPhysics)
                    .addComponent(checkOperatingSystems)
                    .addComponent(checkMathematics)
                    .addComponent(checkGraphTheory)
                    .addComponent(checkInorganicChemestry)
                    .addComponent(checkGeneralBiology)
                    .addComponent(checkEnvironmentalChemistry)
                    .addComponent(checkDistributedComputing)
                    .addComponent(checkComputerScience)
                    .addComponent(checkCellBiology)
                    .addComponent(checkCombinatorics)
                    .addComponent(checkAstronomy)
                    .addComponent(checkAppliedMathematics)
                    .addComponent(checkAlgebra)
                    .addComponent(checkHumanGeography)
                    .addComponent(checkCommunicationStudies)
                    .addComponent(checkPsychology)
                    .addComponent(checkHumanRights)
                    .addComponent(checkSocialWork)
                    .addComponent(checkCriminology)
                    .addComponent(checkSociology)
                    .addComponent(checkStrategyTechnology)
                    .addComponent(checkNegotiation)
                    .addComponent(checkMechanicalEngineering)
                    .addComponent(checkHospitality)
                    .addComponent(checkLogistics))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkHistoryLiterature)
                    .addComponent(checkPhylosophy)
                    .addComponent(checkLinguistics)
                    .addComponent(checkTheatre)
                    .addComponent(checkWorldLiterature)
                    .addComponent(checkHistory)
                    .addComponent(checkArchitecture)
                    .addComponent(checkAsianHistory)
                    .addComponent(checkDance)
                    .addComponent(checkHistoryCulture)
                    .addComponent(checkLegalManagement)
                    .addComponent(checkPerformingArts)
                    .addComponent(checkTelevision)
                    .addComponent(checkWorldHistory)
                    .addComponent(checkAppliedArts)
                    .addComponent(checkAdministrativeLaw)
                    .addComponent(checkCivilLaw)
                    .addComponent(checkLiterature)
                    .addComponent(checkNursing)
                    .addComponent(checkAnalysisStructures)
                    .addComponent(checkMedicineHealth)
                    .addComponent(checkStructuralDesign)
                    .addComponent(checkPharmacology)
                    .addComponent(checkOperationsManagement)
                    .addComponent(checkAudit)
                    .addComponent(checkBuildingMaterialsTheory)
                    .addComponent(checkCapitalMarkets)
                    .addComponent(checkClinicalPhysiology)
                    .addComponent(checkEconometrics)
                    .addComponent(checkFoodAgribusiness)
                    .addComponent(checkEntrepreneurship)
                    .addComponent(checkHumanResource)
                    .addComponent(checkMacroeconomics)
                    .addComponent(checkBusiness)
                    .addComponent(checkChemicalEngineering)
                    .addComponent(checkBusinessEntertainment)
                    .addComponent(checkArchaeology)
                    .addComponent(checkPoliticalScience)
                    .addComponent(checkEducation)
                    .addComponent(checkEconomics)
                    .addComponent(checkCryptocurrencies)
                    .addComponent(checkEducationalTechnology)
                    .addComponent(checkEnvironmentalSciences)
                    .addComponent(checkManagementStudies)
                    .addComponent(checkHydrologyHydrolicSystems)
                    .addComponent(checkMicroeconomics)
                    .addComponent(checkPhysicalEducation)
                    .addComponent(checkAnthropology)
                    .addComponent(checkCulturalStudies)
                    .addComponent(checkEarthScience)
                    .addComponent(checkGeology)
                    .addComponent(checkImmunology)
                    .addComponent(checkMathematicalLogic)
                    .addComponent(checkTourism)
                    .addComponent(checkAnalysis)
                    .addComponent(checkApproximationTheory)
                    .addComponent(checkChemistry)
                    .addComponent(checkBiochemistry)
                    .addComponent(checkComputerCommunications)
                    .addComponent(checkCryptography)
                    .addComponent(checkNumericalAnalysis)
                    .addComponent(checkOrganicChemistry)
                    .addComponent(checkComputerArchitecture)
                    .addComponent(checkEvolutionaryBiology)
                    .addComponent(checkComputerSecurity)
                    .addComponent(checkDynamicalSystems)
                    .addComponent(checkProgrammingLanguages)
                    .addComponent(checkTheoreticalPhysics)
                    .addComponent(checkAppliedPhysics)
                    .addComponent(checkAlgorithms)
                    .addComponent(checkAstrophysics)
                    .addComponent(checkGeneralChemistry)
                    .addComponent(checkHumanComputerInteraction)
                    .addComponent(checkLogicComputerScience)
                    .addComponent(checkOperationsResearch)
                    .addComponent(checkStatistics)
                    .addComponent(checkZoology)
                    .addComponent(checkNumberTheory)
                    .addComponent(checkProbabilityTheory))
                .addGap(53, 53, 53))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(checkAll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkEnglishLanguage)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(checkAfricanHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkArtDesign)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkCreativeWriting)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkJurisprudence)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkModernHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkPoetry)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkTheology)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkAmericanHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkAncientHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkArtHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkCriminalLaw)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(checkFilm)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkLaw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMusic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkRussianHistory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkVisualArts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkOther)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAccounting)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBlockchain)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBusinessAnalysis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkChildcare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkDentistry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkElectricalEngineering)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHealthCare)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkInvestmentStrategies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMaterialsScienceEngineering)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMoneyBanking)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkRealProperty)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMarketing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAdvertising)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBrandValue)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBusinessManagement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCivilEngineering)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkDigitalInnovationTransformation))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(checkHistory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkArchitecture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAsianHistory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkDance)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHistoryCulture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkLegalManagement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPerformingArts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkTelevision)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkWorldHistory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAdministrativeLaw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAppliedArts)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCivilLaw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkLiterature)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHistoryLiterature)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkLinguistics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPhylosophy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkTheatre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkWorldLiterature)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkNursing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAnalysisStructures)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkBuildingMaterialsTheory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCapitalMarkets)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkClinicalPhysiology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEconometrics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEntrepreneurship)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkFoodAgribusiness)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHumanResource)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMacroeconomics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMedicineHealth)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPharmacology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkStructuralDesign)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkOperationsManagement)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAudit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBusiness)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkChemicalEngineering)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(checkEngineering)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkFluidMechanics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHospitality)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkLogistics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMechanicalEngineering)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkNegotiation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkStrategyTechnology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkSociology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkSocialWork)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCriminology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHumanRights)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPsychology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCommunicationStudies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHumanGeography)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAlgebra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAppliedMathematics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAstronomy)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCellBiology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCombinatorics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkComputerScience)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkDistributedComputing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEnvironmentalChemistry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkGeneralBiology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkGraphTheory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkInorganicChemestry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMathematics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkOperatingSystems)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPhysics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkSpaceSciences))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(checkCryptocurrencies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEducationalTechnology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEnvironmentalSciences)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHydrologyHydrolicSystems)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkManagementStudies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMicroeconomics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPhysicalEducation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBusinessEntertainment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPoliticalScience)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkArchaeology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEducation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEconomics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAnthropology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCulturalStudies)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkTourism)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAnalysis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkApproximationTheory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBiochemistry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkChemistry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkComputerCommunications)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCryptography)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEarthScience)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkGeology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkImmunology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMathematicalLogic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkNumericalAnalysis)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkOrganicChemistry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkProgrammingLanguages)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkTheoreticalPhysics)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(checkTopology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAnalyticalChemistry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkArtificialIntelligenece)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkBiology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkCode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkComputerGraphics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkDataStructures)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEcology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkGameTheory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkGeometry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkInformationTheory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkMathematicalPhysics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkNutrition)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkPhysicalChemistry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkQuantumComputing)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkTheoryComputation))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(checkAlgorithms)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAppliedPhysics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkAstrophysics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkEvolutionaryBiology)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkComputerArchitecture)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkComputerSecurity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkDynamicalSystems)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkGeneralChemistry)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkHumanComputerInteraction)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkLogicComputerScience)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkOperationsResearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkNumberTheory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkStatistics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkProbabilityTheory)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkZoology)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel3);

        jPanel4.setBackground(new java.awt.Color(28, 39, 84));
        jPanel4.setToolTipText("[19,28,59]");
        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });

        btnExit1.setBackground(new java.awt.Color(28, 39, 84));
        btnExit1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(255, 255, 255));
        btnExit1.setText("X");
        btnExit1.setBorder(null);
        btnExit1.setBorderPainted(false);
        btnExit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit1MouseClicked(evt);
            }
        });
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(244, 244, 244));
        jLabel4.setText("Clink studybay bot v2.0 - Select subjects");

        btnExit2.setBackground(new java.awt.Color(28, 39, 84));
        btnExit2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnExit2.setForeground(new java.awt.Color(255, 255, 255));
        btnExit2.setText("---");
        btnExit2.setBorder(null);
        btnExit2.setBorderPainted(false);
        btnExit2.setFocusPainted(false);
        btnExit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExit2MouseClicked(evt);
            }
        });
        btnExit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExit2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnExit1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnExit2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(subjects_btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(settings_btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(subjects_btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settings_btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settings_btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settings_btnBackActionPerformed
//        new clinkS().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_settings_btnBackActionPerformed
    private String getSubjects(){
        List<String> subjects = new ArrayList<String>();
        String subjectStr = "";
        
        //All
        if(checkAll.isSelected() == true){
            subjects.add(checkAll.getText().toString().trim());
        }
        
        if(checkEnglishLanguage.isSelected() == true){
            subjects.add(checkEnglishLanguage.getText().toString().trim());
        }
        
        if(checkAfricanHistory.isSelected() == true){
            subjects.add(checkAfricanHistory.getText().toString().trim());
        }
        
        if(checkArtDesign.isSelected() == true){
            subjects.add(checkArtDesign.getText().toString().trim());
        }
        
        //Creative Writing
        if(checkCreativeWriting.isSelected() == true){
           subjects.add(checkCreativeWriting.getText().toString().trim()); 
        }
        
        //Jurisprudence
        if(checkJurisprudence.isSelected() == true){
            subjects.add(checkJurisprudence.getText().toString().trim()); 
        }
        
       //Modern History
        if(checkModernHistory.isSelected() == true){
            subjects.add(checkModernHistory.getText().toString().trim()); 
        }
        
        //Poetry
        if(checkPoetry.isSelected() == true){
            subjects.add(checkPoetry.getText().toString().trim()); 
        }
        
        //Theology
        if(checkTheology.isSelected() == true){
            subjects.add(checkTheology.getText().toString().trim()); 
        }
        
        //American History
        if(checkAmericanHistory.isSelected() == true){
            subjects.add(checkAmericanHistory.getText().toString().trim());
        }
        
        //Ancient History
        if(checkAncientHistory.isSelected() == true){
            subjects.add(checkAncientHistory.getText().toString().trim());
        }
        
        //Art History
        if(checkArtHistory.isSelected() == true){
            subjects.add(checkArtHistory.getText().toString().trim());
        }
        
        //Criminal Law
        if(checkCriminalLaw.isSelected() == true){
            subjects.add(checkCriminalLaw.getText().toString().trim());
        }
                
        //Film
        if(checkFilm.isSelected() == true){
            subjects.add(checkFilm.getText().toString().trim());
        }
        
        //checkLaw
        if(checkLaw.isSelected() == true){
            subjects.add(checkLaw.getText().toString().trim());
        }
        
        //Music
        if(checkMusic.isSelected() == true){
            subjects.add(checkMusic.getText().toString().trim());
        }
        
        //Russian History
        if(checkRussianHistory.isSelected() == true){
            subjects.add(checkRussianHistory.getText().toString().trim());
        }
        
        //Visual Arts
        if(checkVisualArts.isSelected() == true){
            subjects.add(checkVisualArts.getText().toString().trim());
        }
        
        //Others
        if(checkOther.isSelected() == true){
            subjects.add(checkOther.getText().toString().trim());
        }
        
        //Accounting
        if(checkAccounting.isSelected() == true){
            subjects.add(checkAccounting.getText().toString().trim());
        }
        
        //Blockchain
        if(checkBlockchain.isSelected() == true){
            subjects.add(checkBlockchain.getText().toString().trim());
        }
        
        //BusinessAnalysis
        if(checkBusinessAnalysis.isSelected() == true){
            subjects.add(checkBusinessAnalysis.getText().toString().trim());
        }
        
        //Childcare
        if(checkChildcare.isSelected() == true){
            subjects.add(checkChildcare.getText().toString().trim());
        }
        
        //Dentistry
        if(checkDentistry.isSelected() == true){
            subjects.add(checkDentistry.getText().toString().trim());
        }
        
        //Electrical Engineering
        if(checkElectricalEngineering.isSelected() == true){
            subjects.add(checkElectricalEngineering.getText().toString().trim());
        }
        
        //Health Care
        if(checkHealthCare.isSelected() == true){
            subjects.add(checkHealthCare.getText().toString().trim());
        }
        
        //Investment Strategies
        if(checkInvestmentStrategies.isSelected() == true){
            subjects.add(checkInvestmentStrategies.getText().toString().trim());
        }   
        
        //Materials Science Engineering
        if(checkMaterialsScienceEngineering.isSelected() == true){
            subjects.add(checkMaterialsScienceEngineering.getText().toString().trim());
        }
        
        // Money Banking
        if(checkMoneyBanking.isSelected() == true){
            subjects.add(checkMoneyBanking.getText().toString().trim());
        }
        
        // Real Property
        if(checkRealProperty.isSelected() == true){
            subjects.add(checkRealProperty.getText().toString().trim());
        }
        
        // Marketing
        if(checkMarketing.isSelected() == true){
            subjects.add(checkMarketing.getText().toString().trim());
        }
        
        //Advertising
        if(checkAdvertising.isSelected() == true){
            subjects.add(checkAdvertising.getText().toString().trim());
        }
        
        //Brand value
        if(checkBrandValue.isSelected() == true){
            subjects.add(checkBrandValue.getText().toString().trim());
        }
        
        //Business Management
        if(checkBusinessManagement.isSelected() == true){
            subjects.add(checkBusinessManagement.getText().toString().trim());
        }
        
        // Civil Engineering
        if(checkCivilEngineering.isSelected() == true){
            subjects.add(checkCivilEngineering.getText().toString().trim());
        }
        
        // Digital Innovation Transformation
        if(checkDigitalInnovationTransformation.isSelected() == true){
            subjects.add(checkDigitalInnovationTransformation.getText().toString().trim());
        }
        
        // Engineering
        if(checkEngineering.isSelected() == true){
            subjects.add(checkEngineering.getText().toString().trim());
        }
        
        // Fluid Mechanics
        if(checkFluidMechanics.isSelected() == true){
            subjects.add(checkFluidMechanics.getText().toString().trim());
        }
        
        // Hospitality
        if(checkHospitality.isSelected() == true){
            subjects.add(checkHospitality.getText().toString().trim());
        }
                
        // Logistics
        if(checkLogistics.isSelected() == true){
            subjects.add(checkLogistics.getText().toString().trim());
        }
        
        // Mechanical Engineering
        if(checkMechanicalEngineering.isSelected() == true){
            subjects.add(checkMechanicalEngineering.getText().toString().trim());
        }
        
        // Negotiation
        if(checkNegotiation.isSelected() == true){
            subjects.add(checkNegotiation.getText().toString().trim());
        }
        
        // StrategyTechnology
        if(checkStrategyTechnology.isSelected() == true){
            subjects.add(checkStrategyTechnology.getText().toString().trim());
        }
        
        // Sociology
        if(checkSociology.isSelected() == true){
            subjects.add(checkSociology.getText().toString().trim());
        }
        
        // Social Work
        if(checkSocialWork.isSelected() == true){
            subjects.add(checkSocialWork.getText().toString().trim());
        }
        
        // Criminology
        if(checkCriminology.isSelected() == true){
            subjects.add(checkCriminology.getText().toString().trim());
        }
        
        // Human Rights
        if(checkHumanRights.isSelected() == true){
            subjects.add(checkHumanRights.getText().toString().trim());
        }
        
        // Phsycology
        if(checkPsychology.isSelected() == true){
            subjects.add(checkPsychology.getText().toString().trim());
        }
        
        // Communication Studies
        if(checkCommunicationStudies.isSelected() == true){
            subjects.add(checkCommunicationStudies.getText().toString().trim());
        }
        
        // Human Geography
        if(checkHumanGeography.isSelected() == true){
            subjects.add(checkHumanGeography.getText().toString().trim());
        }
        
        // Algebra
        if(checkAlgebra.isSelected() == true){
            subjects.add(checkAlgebra.getText().toString().trim());
        }
        
        // Applied Mathematics
        if(checkAppliedMathematics.isSelected() == true){
            subjects.add(checkAppliedMathematics.getText().toString().trim());
        }
        
        // Astronomy
        if(checkAstronomy.isSelected() == true){
            subjects.add(checkAstronomy.getText().toString().trim());
        }
        
        // Cell Biology
        if(checkCellBiology.isSelected() == true){
            subjects.add(checkCellBiology.getText().toString().trim());
        }
        
        // Combinatorics
        if(checkCombinatorics.isSelected() == true){
            subjects.add(checkCombinatorics.getText().toString().trim());
        }
        
        // Computer Science
        if(checkComputerScience.isSelected() == true){
            subjects.add(checkComputerScience.getText().toString().trim());
        }
        
        // Distributed Computing
        if(checkDistributedComputing.isSelected() == true){
            subjects.add(checkDistributedComputing.getText().toString().trim());
        }
        
        // Environmental Chemistry
        if(checkEnvironmentalChemistry.isSelected() == true){
            subjects.add(checkEnvironmentalChemistry.getText().toString().trim());
        }
        
        // General Biology
        if(checkGeneralBiology.isSelected() == true){
            subjects.add(checkGeneralBiology.getText().toString().trim());
        }
        
        // Graph Theory
        if(checkGraphTheory.isSelected() == true){
            subjects.add(checkGraphTheory.getText().toString().trim());
        }
        
        // Inorganic Chemistry
        if(checkInorganicChemestry.isSelected() == true){
            subjects.add(checkInorganicChemestry.getText().toString().trim());
        }
        
        // Mathematics
        if(checkMathematics.isSelected() == true){
            subjects.add(checkMathematics.getText().toString().trim());
        }
        
        // Operating Systmes
        if(checkOperatingSystems.isSelected() == true){
            subjects.add(checkOperatingSystems.getText().toString().trim());
        }
        
        // Physics
        if(checkPhysics.isSelected() == true){
            subjects.add(checkPhysics.getText().toString().trim());
        }
        
        // Space Sciences
        if(checkSpaceSciences.isSelected() == true){
            subjects.add(checkSpaceSciences.getText().toString().trim());
        }
        
        // Topology
        if(checkTopology.isSelected() == true){
            subjects.add(checkTopology.getText().toString().trim());
        }
        
        // Analytical Chemistry
        if(checkAnalyticalChemistry.isSelected() == true){
            subjects.add(checkAnalyticalChemistry.getText().toString().trim());
        }
        
        // Artificial Intelligence
        if(checkArtificialIntelligenece.isSelected() == true){
            subjects.add(checkArtificialIntelligenece.getText().toString().trim());
        }
        
        // Biology
        if(checkBiology.isSelected() == true){
            subjects.add(checkBiology.getText().toString().trim());
        }
        
        // Code
        if(checkCode.isSelected() == true){
            subjects.add(checkCode.getText().toString().trim());
        }
        
        // Computer Graphics
        if(checkComputerGraphics.isSelected() == true){
            subjects.add(checkComputerGraphics.getText().toString().trim());
        }
        
        // Data Structures
        if(checkDataStructures.isSelected() == true){
            subjects.add(checkDataStructures.getText().toString().trim());
        }
        
        // Ecology
        if(checkEcology.isSelected() == true){
            subjects.add(checkEcology.getText().toString().trim());
        }
        
        // Game Theory
        if(checkGameTheory.isSelected() == true){
            subjects.add(checkGameTheory.getText().toString().trim());
        }
        
        // Geometry
        if(checkGeometry.isSelected() == true){
            subjects.add(checkGeometry.getText().toString().trim());
        }
        
        // Information Theory
        if(checkInformationTheory.isSelected() == true){
            subjects.add(checkInformationTheory.getText().toString().trim());
        }
        
        // Mathematical Physics
        if(checkMathematicalPhysics.isSelected() == true){
            subjects.add(checkMathematicalPhysics.getText().toString().trim()); 
        }
        
        // Nutrition
        if(checkNutrition.isSelected() == true){
            subjects.add(checkNutrition.getText().toString().trim());
        }
        
        // Physical Chemistry
        if(checkPhysicalChemistry.isSelected() == true){
            subjects.add(checkPhysicalChemistry.getText().toString().trim());
        }
        
        // Quantum Computing
        if(checkQuantumComputing.isSelected() == true){
            subjects.add(checkQuantumComputing.getText().toString().trim());
        }
        
        // Theory Computation
        if(checkTheoryComputation.isSelected() == true){
            subjects.add(checkTheoryComputation.getText().toString().trim());
        }
        
        // History
        if(checkHistory.isSelected() == true){
            subjects.add(checkHistory.getText().toString().trim());
        }
        
        // Architecture
        if(checkArchitecture.isSelected() == true){
            subjects.add(checkArchitecture.getText().toString().trim());
        }
        
        // Asian History
        if(checkAsianHistory.isSelected() == true){
            subjects.add(checkAsianHistory.getText().toString().trim());
        }
        
        // Dance
        if(checkDance.isSelected() == true){
            subjects.add(checkDance.getText().toString().trim());
        }
        
        // History Culture
        if(checkHistoryCulture.isSelected() == true){
            subjects.add(checkHistoryCulture.getText().toString().trim());
        }
        
        // Legal Management
        if(checkLegalManagement.isSelected() == true){
            subjects.add(checkLegalManagement.getText().toString().trim());
        }
        
        // Performing Arts
        if(checkPerformingArts.isSelected() == true){
            subjects.add(checkPerformingArts.getText().toString().trim());
        }
        
        // Television
        if(checkTelevision.isSelected() == true){
            subjects.add(checkTelevision.getText().toString().trim());
        }
        
        // World History
        if(checkWorldHistory.isSelected() == true){
            subjects.add(checkWorldHistory.getText().toString().trim());
        }
        
        // Administrative Law
        if(checkAdministrativeLaw.isSelected() == true){
            subjects.add(checkAdministrativeLaw.getText().toString().trim());
        }
        
        // Applied Arts
        if(checkAppliedArts.isSelected() == true){
           subjects.add(checkAppliedArts.getText().toString().trim());
        }
        
        // Civil Law
        if(checkCivilLaw.isSelected() == true){
            subjects.add(checkCivilLaw.getText().toString().trim());
        }
        
        // Literature
        if(checkLiterature.isSelected() == true){
            subjects.add(checkLiterature.getText().toString().trim());
        }
        
        // History Literature
        if(checkHistoryLiterature.isSelected() == true){
            subjects.add(checkHistoryLiterature.getText().toString().trim());
        }
        
        // Linguistics
        if(checkLinguistics.isSelected() == true){
            subjects.add(checkLinguistics.getText().toString().trim());
        }
        
        // Phylosophy
        if(checkPhylosophy.isSelected() == true){
            subjects.add(checkPhylosophy.getText().toString().trim());
        }
        
        // Theatre
        if(checkTheatre.isSelected() == true){
            subjects.add(checkTheatre.getText().toString().trim());
        }
        
        
        // World Literature
        if(checkWorldLiterature.isSelected() == true){
            subjects.add(checkWorldLiterature.getText().toString().trim());
        }
        
        // Nursing
        if(checkNursing.isSelected() == true){
            subjects.add(checkNursing.getText().toString().trim());
        }
        
        // Analysis Structures
        if(checkAnalysisStructures.isSelected() == true){
            subjects.add(checkAnalysisStructures.getText().toString().trim());
        }
        
        // Building Materials Theory
        if(checkBuildingMaterialsTheory.isSelected() == true){
            subjects.add(checkBuildingMaterialsTheory.getText().toString().trim());
        }
        
        // Capital Markets
        if(checkCapitalMarkets.isSelected() == true){
            subjects.add(checkCapitalMarkets.getText().toString().trim());
        }
        
        // Clinical Physiology
        if(checkClinicalPhysiology.isSelected() == true){
            subjects.add(checkClinicalPhysiology.getText().toString().trim());
        }
        
        // Econometrics
        if(checkEconometrics.isSelected() == true){
            subjects.add(checkEconometrics.getText().toString().trim());
        }
        
        // Entrepreneurship
        if(checkEntrepreneurship.isSelected() == true){
            subjects.add(checkEntrepreneurship.getText().toString().trim());
        }
        
        // Food Agribusiness
        if(checkFoodAgribusiness.isSelected() == true){
            subjects.add(checkFoodAgribusiness.getText().toString().trim());
        }
        
        // Human Resource
        if(checkHumanResource.isSelected() == true){
            subjects.add(checkHumanResource.getText().toString().trim());
        }
        
        // Macroeconomics
        if(checkMacroeconomics.isSelected() == true){
            subjects.add(checkMacroeconomics.getText().toString().trim());
        }
        
        // Medicine Health
        if(checkMedicineHealth.isSelected() == true){
            subjects.add(checkMedicineHealth.getText().toString().trim());
        }
        
        // Pharmacology
        if(checkPharmacology.isSelected() == true){
            subjects.add(checkPharmacology.getText().toString().trim());
        }
        
        // Structural design
        if(checkStructuralDesign.isSelected() == true){
            subjects.add(checkStructuralDesign.getText().toString().trim());
        }
        
        // Operations management
        if(checkOperationsManagement.isSelected() == true){
            subjects.add(checkOperationsManagement.getText().toString().trim());
        }
        
        // Audit
        if(checkAudit.isSelected() == true){
            subjects.add(checkAudit.getText().toString().trim());
        }
        
        // Business
        if(checkBusiness.isSelected() == true){
            subjects.add(checkBusiness.getText().toString().trim());
        }
        
        // Chemical Engineering
        if(checkChemicalEngineering.isSelected() == true){
            subjects.add(checkChemicalEngineering.getText().toString().trim());
        }
        
        // Cryptocurrencies
        if(checkCryptocurrencies.isSelected() == true){
            subjects.add(checkCryptocurrencies.getText().toString().trim());
        }
        
        // Educational Technology
        if(checkEducationalTechnology.isSelected() == true){
            subjects.add(checkEducationalTechnology.getText().toString().trim());
        }
        
        // Environmental sciences
        if(checkEnvironmentalSciences.isSelected() == true){
            subjects.add(checkEnvironmentalSciences.getText().toString().trim());
        }
        
        // Hydrology Hydrolic Systems
        if(checkHydrologyHydrolicSystems.isSelected() == true){
            subjects.add(checkHydrologyHydrolicSystems.getText().toString().trim());
        }
        
        // Management studies
        if(checkManagementStudies.isSelected() == true){
            subjects.add(checkManagementStudies.getText().toString().trim());
        }
        
        // Microeconomics
        if(checkMicroeconomics.isSelected() == true){
            subjects.add(checkMicroeconomics.getText().toString().trim());
        }
        
        //Physical Education
        if(checkPhysicalEducation.isSelected() == true){
            subjects.add(checkPhysicalEducation.getText().toString().trim());
        }
        
        // Business Entertainment
        if(checkBusinessEntertainment.isSelected() == true){
            subjects.add(checkBusinessEntertainment.getText().toString().trim());
        }
        
        // Political science
        if(checkPoliticalScience.isSelected() == true){
            subjects.add(checkPoliticalScience.getText().toString().trim());
        }
        
        // Archaeology
        if(checkArchaeology.isSelected() == true){
            subjects.add(checkArchaeology.getText().toString().trim());
        }
        
        // Education
        if(checkEducation.isSelected() == true){
            subjects.add(checkEducation.getText().toString().trim());
        }
        
        // Economics
        if(checkEconomics.isSelected() == true){
            subjects.add(checkEconomics.getText().toString().trim());
        }
        
        // Anthropology
        if(checkAnthropology.isSelected() == true){
            subjects.add(checkAnthropology.getText().toString().trim());
        }
        
        // Cultural studies
        if(checkCulturalStudies.isSelected() == true){
            subjects.add(checkCulturalStudies.getText().toString().trim());
        }
        // Tourism
        if(checkTourism.isSelected() == true){
            subjects.add(checkTourism.getText().toString().trim());
        }
        
        // Analysis
        if(checkAnalysis.isSelected() == true){
            subjects.add(checkAnalysis.getText().toString().trim());
        }
        
        // Approximation theory
        if(checkApproximationTheory.isSelected() == true){
            subjects.add(checkApproximationTheory.getText().toString().trim());
        }
        
        // Biochemistry
        if(checkBiochemistry.isSelected() == true){
            subjects.add(checkBiochemistry.getText().toString().trim());
        }
        
        // Chemistry
        if(checkChemistry.isSelected() == true){
            subjects.add(checkChemistry.getText().toString().trim());
        }
        
        // Computer communications
        if(checkComputerCommunications.isSelected() == true){
            subjects.add(checkComputerCommunications.getText().toString().trim());
        }
        
        // Cryptography
        if(checkCryptography.isSelected() == true){
            subjects.add(checkCryptography.getText().toString().trim());
        }
        
        // Earth Science
        if(checkEarthScience.isSelected() == true){
            subjects.add(checkEarthScience.getText().toString().trim());
        }
        
        // Geology
        if(checkGeology.isSelected() == true){
            subjects.add(checkGeology.getText().toString().trim());
        }
        
        // Immunology
        if(checkImmunology.isSelected() == true){
            subjects.add(checkImmunology.getText().toString().trim());
        }
        
        // Mathematical logic
        if(checkMathematicalLogic.isSelected() == true){
            subjects.add(checkMathematicalLogic.getText().toString().trim());
        }
        
        // Numerical analysis
        if(checkNumericalAnalysis.isSelected() == true){
            subjects.add(checkNumericalAnalysis.getText().toString().trim());
        }
        
        // Organic chemistry
        if(checkOrganicChemistry.isSelected() == true){
            subjects.add(checkOrganicChemistry.getText().toString().trim());
        }
        
        // Programming Languages
        if(checkProgrammingLanguages.isSelected() == true){
            subjects.add(checkProgrammingLanguages.getText().toString().trim());
        }
        
        // Theoretical physics
        if(checkTheoreticalPhysics.isSelected() == true){
            subjects.add(checkTheoreticalPhysics.getText().toString().trim());
        }
        
        // Algorithms
        if(checkAlgorithms.isSelected() == true){
            subjects.add(checkAlgorithms.getText().toString().trim());
        }
        
        // Applied Physics
        if(checkAppliedPhysics.isSelected() == true){
            subjects.add(checkAppliedPhysics.getText().toString().trim());
        }
        
        // Astrophysics
        if(checkAstrophysics.isSelected() == true){
            subjects.add(checkAstrophysics.getText().toString().trim());
        }
        
        // Evolutionary Biology
        if(checkEvolutionaryBiology.isSelected() == true){
            subjects.add(checkEvolutionaryBiology.getText().toString().trim());
        }
        
        // Computer Architecture
        if(checkComputerArchitecture.isSelected() == true){
            subjects.add(checkComputerArchitecture.getText().toString().trim());
        }
        
        // Computer security
        if(checkComputerSecurity.isSelected() == true){
            subjects.add(checkComputerSecurity.getText().toString().trim());
        }
        
        // Dynamical systems
        if(checkGeneralChemistry.isSelected() == true){
            subjects.add(checkGeneralChemistry.getText().toString().trim());
        }
        
        // General chemistry
        if(checkGeneralChemistry.isSelected() == true){
            subjects.add(checkGeneralChemistry.getText().toString().trim());
        }
        
        // Human Computer Interaction
        if(checkHumanComputerInteraction.isSelected() == true){
            subjects.add(checkHumanComputerInteraction.getText().toString().trim());
        }
        
        // Logic in computer science
        if(checkLogicComputerScience.isSelected() == true){
            subjects.add(checkLogicComputerScience.getText().toString().trim());
        }
        
        // Operations research
        if(checkOperationsResearch.isSelected() == true){
            subjects.add(checkOperationsResearch.getText().toString().trim());
        }
        
        // Number Theory
        if(checkNumberTheory.isSelected() == true){
            subjects.add(checkNumberTheory.getText().toString().trim());
        }
        
        // Statistics
        if(checkStatistics.isSelected() == true){
            subjects.add(checkStatistics.getText().toString().trim());
        }
        
        // Probability theory
        if(checkProbabilityTheory.isSelected() == true){
            subjects.add(checkProbabilityTheory.getText().toString().trim());
        }
        
        // Zoology
        if(checkZoology.isSelected() == true){
            subjects.add(checkZoology.getText().toString().trim());
        }
        
        
        
        System.out.println("Subjects "+subjects);
        if (subjects.size() > 0) { 
            StringBuilder sb = new StringBuilder(); 
            for (String s : subjects) { 
                sb.append(s).append(","); 
            } 
            subjectStr = sb.deleteCharAt(sb.length() - 1).toString(); 
        }else{
            subjectStr = "null";
        }
        
        return subjectStr;
    }
    private void subjects_btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjects_btnSaveActionPerformed
         String acceptedSubjects = getSubjects();
        
        try { 
                FileWriter myWriter = new FileWriter(subjects_path);
                myWriter.write(acceptedSubjects);
                myWriter.close();
                
                JOptionPane.showMessageDialog(null, "Subjects Successfully saved");
                this.dispose();
                
            } catch (IOException ex) {
                Logger.getLogger(clinkSettings.class.getName()).log(Level.SEVERE, null, ex);
            }
       
    }//GEN-LAST:event_subjects_btnSaveActionPerformed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
         int x = evt.getXOnScreen()-this.x;
        int y = evt.getYOnScreen()-this.y;
        this.setLocation(x,y); 
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void checkAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkAllActionPerformed

    private void jPanel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MouseDragged

    private void jPanel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel3MousePressed

    private void checkAllItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_checkAllItemStateChanged
        if(checkAll.isSelected() == true){
           checkEnglishLanguage.setSelected(false);
           checkAfricanHistory.setSelected(false);
           checkArtDesign.setSelected(false);
           checkCreativeWriting.setSelected(false);
           checkJurisprudence.setSelected(false);
           checkModernHistory.setSelected(false);
           checkPoetry.setSelected(false);
           checkTheology.setSelected(false);
           checkAmericanHistory.setSelected(false);
           checkAncientHistory.setSelected(false);
           checkArtHistory.setSelected(false);
           checkCriminalLaw.setSelected(false);
           checkLaw.setSelected(false);
           checkFilm.setSelected(false);
           checkMusic.setSelected(false);
           checkRussianHistory.setSelected(false);
           checkVisualArts.setSelected(false);
           checkOther.setSelected(false);
           checkAccounting.setSelected(false);
           checkBlockchain.setSelected(false);
           checkBusinessAnalysis.setSelected(false);
           checkChildcare.setSelected(false);
           checkDentistry.setSelected(false);
           checkElectricalEngineering.setSelected(false);
           checkHealthCare.setSelected(false);
           checkInvestmentStrategies.setSelected(false);
           checkMaterialsScienceEngineering.setSelected(false);
           checkMoneyBanking.setSelected(false);
           checkRealProperty.setSelected(false);
           checkMarketing.setSelected(false);
           checkAdvertising.setSelected(false);
           checkBrandValue.setSelected(false);
           checkBusinessManagement.setSelected(false);
           checkCivilEngineering.setSelected(false);
           checkEngineering.setSelected(false);
           checkFluidMechanics.setSelected(false);
           checkHospitality.setSelected(false);
           checkLogistics.setSelected(false);
           checkMechanicalEngineering.setSelected(false);
           checkNegotiation.setSelected(false);
           checkStrategyTechnology.setSelected(false);
           checkSociology.setSelected(false);
           checkSocialWork.setSelected(false);
           checkCriminology.setSelected(false);
           checkHumanRights.setSelected(false);
           checkPsychology.setSelected(false);
           checkCommunicationStudies.setSelected(false);
           checkHumanGeography.setSelected(false);
           checkAlgebra.setSelected(false);
           checkAppliedMathematics.setSelected(false);
           checkAstronomy.setSelected(false);
           checkCellBiology.setSelected(false);
           checkCombinatorics.setSelected(false);
           checkComputerScience.setSelected(false);
           checkDistributedComputing.setSelected(false);
           checkEnvironmentalChemistry.setSelected(false);
           checkGeneralBiology.setSelected(false);
           checkGraphTheory.setSelected(false);
           checkInorganicChemestry.setSelected(false);
           checkMathematics.setSelected(false);
           checkOperatingSystems.setSelected(false);
           checkPhysics.setSelected(false);
           checkSpaceSciences.setSelected(false);
           checkTopology.setSelected(false);
           checkAnalyticalChemistry.setSelected(false);
           checkArtificialIntelligenece.setSelected(false);
           checkBiology.setSelected(false);
           checkCode.setSelected(false);
           checkComputerGraphics.setSelected(false);
           checkDataStructures.setSelected(false);
           checkEcology.setSelected(false);
           checkGameTheory.setSelected(false);
           checkGeometry.setSelected(false);
           checkInformationTheory.setSelected(false);
           checkMathematicalPhysics.setSelected(false);
           checkNutrition.setSelected(false);
           checkPhysicalChemistry.setSelected(false);
           checkQuantumComputing.setSelected(false);
           checkTheoryComputation.setSelected(false);
           checkHistory.setSelected(false);
           checkArchitecture.setSelected(false);
           checkAsianHistory.setSelected(false);
           checkDance.setSelected(false);
           checkHistoryCulture.setSelected(false);
           checkLegalManagement.setSelected(false);
           checkPerformingArts.setSelected(false);
           checkTelevision.setSelected(false);
           checkWorldHistory.setSelected(false);
           checkAdministrativeLaw.setSelected(false);
           checkAppliedArts.setSelected(false);
           checkCivilLaw.setSelected(false);
           checkLiterature.setSelected(false);
           checkHistoryLiterature.setSelected(false);
           checkLinguistics.setSelected(false);
           checkPhylosophy.setSelected(false);
           checkTheatre.setSelected(false);
           checkWorldLiterature.setSelected(false);
           checkNursing.setSelected(false);
           checkAnalysisStructures.setSelected(false);
           checkBuildingMaterialsTheory.setSelected(false);   
           checkCapitalMarkets.setSelected(false);
           checkClinicalPhysiology.setSelected(false);
           checkEconometrics.setSelected(false);
           checkEntrepreneurship.setSelected(false);
           checkFoodAgribusiness.setSelected(false);
           checkHumanResource.setSelected(false);
           checkMacroeconomics.setSelected(false);
           checkMedicineHealth.setSelected(false);
           checkPharmacology.setSelected(false);
           checkStructuralDesign.setSelected(false);
           checkOperationsManagement.setSelected(false);
           checkAudit.setSelected(false);
           checkBusiness.setSelected(false);
           checkChemicalEngineering.setSelected(false);
           checkCryptocurrencies.setSelected(false);
            checkEducationalTechnology.setSelected(false);
            checkEnvironmentalSciences.setSelected(false);
            checkHydrologyHydrolicSystems.setSelected(false);
            checkManagementStudies.setSelected(false);
            checkMicroeconomics.setSelected(false);
            checkPhysicalEducation.setSelected(false);
            checkBusinessEntertainment.setSelected(false);
            checkPoliticalScience.setSelected(false);
            checkArchaeology.setSelected(false);
            checkEducation.setSelected(false);
            checkEconomics.setSelected(false);
            checkAnthropology.setSelected(false);
            checkCulturalStudies.setSelected(false);
            checkTourism.setSelected(false);
            checkAnalysis.setSelected(false);
            checkApproximationTheory.setSelected(false);
            checkBiochemistry.setSelected(false);
            checkChemistry.setSelected(false);
            checkComputerCommunications.setSelected(false);
            checkCryptography.setSelected(false);
            checkEarthScience.setSelected(false);
            checkGeology.setSelected(false);
            checkImmunology.setSelected(false);
            checkMathematicalLogic.setSelected(false);
            checkNumericalAnalysis.setSelected(false);
            checkOrganicChemistry.setSelected(false);
            checkProgrammingLanguages.setSelected(false);
            checkTheoreticalPhysics.setSelected(false);
            checkAlgorithms.setSelected(false);
            checkAppliedPhysics.setSelected(false);
            checkAstrophysics.setSelected(false);
            checkEvolutionaryBiology.setSelected(false);
            checkComputerArchitecture.setSelected(false);
            checkComputerSecurity.setSelected(false);
            checkDynamicalSystems.setSelected(false);
            checkGeneralChemistry.setSelected(false);
            checkHumanComputerInteraction.setSelected(false);
            checkLogicComputerScience.setSelected(false);
            checkOperationsResearch.setSelected(false);
            checkNumberTheory.setSelected(false);
            checkStatistics.setSelected(false);
            checkProbabilityTheory.setSelected(false);
            checkZoology.setSelected(false);
        }else{
           checkEnglishLanguage.setSelected(true);
           checkAfricanHistory.setSelected(true);
           checkArtDesign.setSelected(true);
           checkCreativeWriting.setSelected(true);
           checkJurisprudence.setSelected(true);
           checkModernHistory.setSelected(true);
           checkPoetry.setSelected(true);
           checkTheology.setSelected(true);
           checkAmericanHistory.setSelected(true);
           checkAncientHistory.setSelected(true);
           checkArtHistory.setSelected(true);
           checkCriminalLaw.setSelected(true);
           checkLaw.setSelected(true);
           checkFilm.setSelected(true);
           checkMusic.setSelected(true);
           checkRussianHistory.setSelected(true);
           checkVisualArts.setSelected(true);
           checkOther.setSelected(true);
           checkAccounting.setSelected(true);
           checkBlockchain.setSelected(true);
           checkBusinessAnalysis.setSelected(true);
           checkChildcare.setSelected(true);
           checkDentistry.setSelected(true);
           checkElectricalEngineering.setSelected(true);
           checkHealthCare.setSelected(true);
           checkInvestmentStrategies.setSelected(true);
           checkMaterialsScienceEngineering.setSelected(true);
           checkMoneyBanking.setSelected(true);
           checkRealProperty.setSelected(true);
           checkMarketing.setSelected(true);
           checkAdvertising.setSelected(true);
           checkBrandValue.setSelected(true);
           checkBusinessManagement.setSelected(true);
           checkCivilEngineering.setSelected(true);
           checkEngineering.setSelected(true);
           checkFluidMechanics.setSelected(true);
           checkHospitality.setSelected(true);
           checkLogistics.setSelected(true);
           checkMechanicalEngineering.setSelected(true);
           checkNegotiation.setSelected(true);
           checkStrategyTechnology.setSelected(true);
           checkSociology.setSelected(true);
           checkSocialWork.setSelected(true);
           checkCriminology.setSelected(true);
           checkHumanRights.setSelected(true);
           checkPsychology.setSelected(true);
           checkCommunicationStudies.setSelected(true);
           checkHumanGeography.setSelected(true);
           checkAlgebra.setSelected(true);
           checkAppliedMathematics.setSelected(true);
           checkAstronomy.setSelected(true);
           checkCellBiology.setSelected(true);
           checkCombinatorics.setSelected(true);
           checkComputerScience.setSelected(true);
           checkDistributedComputing.setSelected(true);
           checkEnvironmentalChemistry.setSelected(true);
           checkGeneralBiology.setSelected(true);
           checkGraphTheory.setSelected(true);
           checkInorganicChemestry.setSelected(true);
           checkMathematics.setSelected(true);
           checkOperatingSystems.setSelected(true);
           checkPhysics.setSelected(true);
           checkSpaceSciences.setSelected(true);
           checkTopology.setSelected(true);
           checkAnalyticalChemistry.setSelected(true);
           checkArtificialIntelligenece.setSelected(true);
           checkBiology.setSelected(true);
           checkCode.setSelected(true);
           checkComputerGraphics.setSelected(true);
           checkDataStructures.setSelected(true);
           checkEcology.setSelected(true);
           checkGameTheory.setSelected(true);
           checkGeometry.setSelected(true);
           checkInformationTheory.setSelected(true);
           checkMathematicalPhysics.setSelected(true);
           checkNutrition.setSelected(true);
           checkPhysicalChemistry.setSelected(true);
           checkQuantumComputing.setSelected(true);
           checkTheoryComputation.setSelected(true);
           checkHistory.setSelected(true);
           checkArchitecture.setSelected(true);
           checkAsianHistory.setSelected(true);
           checkDance.setSelected(true);
           checkHistoryCulture.setSelected(true);
           checkLegalManagement.setSelected(true);
           checkPerformingArts.setSelected(true);
           checkTelevision.setSelected(true);
           checkWorldHistory.setSelected(true);
           checkAdministrativeLaw.setSelected(true);
           checkAppliedArts.setSelected(true);
           checkCivilLaw.setSelected(true);
           checkLiterature.setSelected(true);
           checkHistoryLiterature.setSelected(true);
           checkLinguistics.setSelected(true);
           checkPhylosophy.setSelected(true);
           checkTheatre.setSelected(true);
           checkWorldLiterature.setSelected(true);
           checkNursing.setSelected(true);
           checkAnalysisStructures.setSelected(true);
           checkBuildingMaterialsTheory.setSelected(true);   
           checkCapitalMarkets.setSelected(true);
           checkClinicalPhysiology.setSelected(true);
           checkEconometrics.setSelected(true);
           checkEntrepreneurship.setSelected(true);
           checkFoodAgribusiness.setSelected(true);
           checkHumanResource.setSelected(true);
           checkMacroeconomics.setSelected(true);
           checkMedicineHealth.setSelected(true);
           checkPharmacology.setSelected(true);
           checkStructuralDesign.setSelected(true);
           checkOperationsManagement.setSelected(true);
           checkAudit.setSelected(true);
           checkBusiness.setSelected(true);
           checkChemicalEngineering.setSelected(true);
            checkCryptocurrencies.setSelected(true);
            checkEducationalTechnology.setSelected(true);
            checkEnvironmentalSciences.setSelected(true);
            checkHydrologyHydrolicSystems.setSelected(true);
            checkManagementStudies.setSelected(true);
            checkMicroeconomics.setSelected(true);
            checkPhysicalEducation.setSelected(true);
            checkBusinessEntertainment.setSelected(true);
            checkPoliticalScience.setSelected(true);
            checkArchaeology.setSelected(true);
            checkEducation.setSelected(true);
            checkEconomics.setSelected(true);
            checkAnthropology.setSelected(true);
            checkCulturalStudies.setSelected(true);
            checkTourism.setSelected(true);
            checkAnalysis.setSelected(true);
            checkApproximationTheory.setSelected(true);
            checkBiochemistry.setSelected(true);
            checkChemistry.setSelected(true);
            checkComputerCommunications.setSelected(true);
            checkCryptography.setSelected(true);
            checkEarthScience.setSelected(true);
            checkGeology.setSelected(true);
            checkImmunology.setSelected(true);
            checkMathematicalLogic.setSelected(true);
            checkNumericalAnalysis.setSelected(true);
            checkOrganicChemistry.setSelected(true);
            checkProgrammingLanguages.setSelected(true);
            checkTheoreticalPhysics.setSelected(true);
            checkAlgorithms.setSelected(true);
            checkAppliedPhysics.setSelected(true);
            checkAstrophysics.setSelected(true);
            checkEvolutionaryBiology.setSelected(true);
            checkComputerArchitecture.setSelected(true);
            checkComputerSecurity.setSelected(true);
            checkDynamicalSystems.setSelected(true);
            checkGeneralChemistry.setSelected(true);
            checkHumanComputerInteraction.setSelected(true);
            checkLogicComputerScience.setSelected(true);
            checkOperationsResearch.setSelected(true);
            checkNumberTheory.setSelected(true);
            checkStatistics.setSelected(true);
            checkProbabilityTheory.setSelected(true);
            checkZoology.setSelected(true);
        }
        
        
        
        //English Language
        if(checkEnglishLanguage.isSelected() == false){
            checkEnglishLanguage.setSelected(true);
        }else{
            checkEnglishLanguage.setSelected(false);
        }
        
        //African History
        if(checkAfricanHistory.isSelected() == false){
            checkAfricanHistory.setSelected(true);
        }else{
            checkAfricanHistory.setSelected(false);
        }
        
        //Art and design
        if(checkArtDesign.isSelected() == false){
            checkArtDesign.setSelected(true);
        }else{
            checkArtDesign.setSelected(false);
        }
        
        //Creative Writing
        if(checkCreativeWriting.isSelected() == false){
            checkCreativeWriting.setSelected(true);
        }else{
            checkCreativeWriting.setSelected(false);
        }
        
        //Jurisprudence
        if(checkJurisprudence.isSelected() == false){
            checkJurisprudence.setSelected(true);
        }else{
            checkJurisprudence.setSelected(false);
        }
        
        
       //Modern History
        if(checkModernHistory.isSelected() == false){
            checkModernHistory.setSelected(true);
        }else{
            checkModernHistory.setSelected(false);
        }
        
        //Poetry
        if(checkPoetry.isSelected() == false){
            checkPoetry.setSelected(true);
        }else{
            checkPoetry.setSelected(false);
        }
        
        //Theology
        if(checkTheology.isSelected() == false){
            checkTheology.setSelected(true);
        }else{
            checkTheology.setSelected(false);
        }
        
        //American History
        if(checkAmericanHistory.isSelected() == false){
            checkAmericanHistory.setSelected(true);
        }else{
            checkAmericanHistory.setSelected(false);
        }
        
        //Ancient History
        if(checkAncientHistory.isSelected() == false){
            checkAncientHistory.setSelected(true);
        }else{
            checkAncientHistory.setSelected(false);
        }
        
        //Art History
        if(checkArtHistory.isSelected() == false){
            checkArtHistory.setSelected(true);
        }else{
            checkArtHistory.setSelected(false);
        }
        
        //Criminal Law
        if(checkCriminalLaw.isSelected() == false){
            checkCriminalLaw.setSelected(true);
        }else{
            checkCriminalLaw.setSelected(false);
        }
                
        //Film
        if(checkFilm.isSelected() == false){
            checkFilm.setSelected(true);
        }else{
            checkFilm.setSelected(false);
        }
        
        //checkLaw
        if(checkLaw.isSelected() == false){
            checkLaw.setSelected(true);
        }else{
            checkLaw.setSelected(false);
        }
        
        //Music
        if(checkMusic.isSelected() == false){
            checkMusic.setSelected(true);
        }else{
            checkMusic.setSelected(false);
        }
        
        //Russian History
        if(checkRussianHistory.isSelected() == false){
            checkRussianHistory.setSelected(true);
        }else{
            checkRussianHistory.setSelected(false);
        }
        
        //Visual Arts
        if(checkVisualArts.isSelected() == false){
            checkVisualArts.setSelected(true);
        }else{
            checkVisualArts.setSelected(false);
        }
        
        //Others
        if(checkOther.isSelected() == false){
            checkOther.setSelected(true);
        }else{
            checkOther.setSelected(false);
        }
        
        //Accounting
        if(checkAccounting.isSelected() == false){
            checkAccounting.setSelected(true);
        }else{
            checkAccounting.setSelected(false);
        }
        
        //Blockchain
        if(checkBlockchain.isSelected() == false){
            checkBlockchain.setSelected(true);
        }else{
            checkBlockchain.setSelected(false);
        }
        
        //BusinessAnalysis
        if(checkBusinessAnalysis.isSelected() == false){
            checkBusinessAnalysis.setSelected(true);
        }else{
            checkBusinessAnalysis.setSelected(false);
        }
        
        //Childcare
        if(checkChildcare.isSelected() == false){
            checkChildcare.setSelected(true);
        }else{
            checkChildcare.setSelected(false);
        }
        
        //Dentistry
        if(checkDentistry.isSelected() == false){
            checkDentistry.setSelected(true);
        }else{
            checkDentistry.setSelected(false);
        }
        
        //Electrical Engineering
        if(checkElectricalEngineering.isSelected() == false){
            checkElectricalEngineering.setSelected(true);
        }else{
            checkElectricalEngineering.setSelected(false);
        }
        
        //Health Care
        if(checkHealthCare.isSelected() == false){
            checkHealthCare.setSelected(true);
        }else{
            checkHealthCare.setSelected(false);
        }
        
        //Investment Strategies
        if(checkInvestmentStrategies.isSelected() == false){
            checkInvestmentStrategies.setSelected(true);
        }else{
            checkInvestmentStrategies.setSelected(false);
        }   
        
        //Materials Science Engineering
        if(checkMaterialsScienceEngineering.isSelected() == false){
            checkMaterialsScienceEngineering.setSelected(true);
        }else{
            checkMaterialsScienceEngineering.setSelected(false);
        }
        
        // Money Banking
        if(checkMoneyBanking.isSelected() == false){
            checkMoneyBanking.setSelected(true);
        }else{
            checkMoneyBanking.setSelected(false);
        }
        
        // Real Property
        if(checkRealProperty.isSelected() == false){
            checkRealProperty.setSelected(true);
        }else{
            checkRealProperty.setSelected(false);
        }
        
        // Marketing
        if(checkMarketing.isSelected() == false){
            checkMarketing.setSelected(true);
        }else{
            checkMarketing.setSelected(false);
        }
        
        //Advertising
        if(checkAdvertising.isSelected() == false){
            checkAdvertising.setSelected(true);
        }else{
            checkAdvertising.setSelected(false);
        }
        
        //Brand value
        if(checkBrandValue.isSelected() == false){
            checkBrandValue.setSelected(true);
        }else{
            checkBrandValue.setSelected(false);
        }
        
        //Business Management
        if(checkBusinessManagement.isSelected() == false){
            checkBusinessManagement.setSelected(true);
        }else{
            checkBusinessManagement.setSelected(false);
        }
        
        // Civil Engineering
        if(checkCivilEngineering.isSelected() == false){
            checkCivilEngineering.setSelected(true);
        }else{
            checkCivilEngineering.setSelected(false);
        }
        
        // Digital Innovation Transformation
        if(checkDigitalInnovationTransformation.isSelected() == false){
            checkDigitalInnovationTransformation.setSelected(true);
        }else{
            checkDigitalInnovationTransformation.setSelected(false);
        }
        
        // Engineering
        if(checkEngineering.isSelected() == false){
            checkEngineering.setSelected(true);
        }else{
            checkEngineering.setSelected(false);
        }
        
        // Fluid Mechanics
        if(checkFluidMechanics.isSelected() == false){
            checkFluidMechanics.setSelected(true);
        }else{
            checkFluidMechanics.setSelected(false);
        }
        
        // Hospitality
        if(checkHospitality.isSelected() == false){
            checkHospitality.setSelected(true);
        }else{
            checkHospitality.setSelected(false);
        }
                
        // Logistics
        if(checkLogistics.isSelected() == false){
            checkLogistics.setSelected(true);
        }else{
            checkLogistics.setSelected(false);
        }
        
        // Mechanical Engineering
        if(checkMechanicalEngineering.isSelected() == false){
            checkMechanicalEngineering.setSelected(true);
        }else{
            checkMechanicalEngineering.setSelected(false);
        }
        
        // Negotiation
        if(checkNegotiation.isSelected() == false){
            checkNegotiation.setSelected(true);
        }else{
            checkNegotiation.setSelected(false);
        }
        
        // StrategyTechnology
        if(checkStrategyTechnology.isSelected() == false){
            checkStrategyTechnology.setSelected(true);
        }else{
            checkStrategyTechnology.setSelected(false);
        }
        
        // Sociology
        if(checkSociology.isSelected() == false){
            checkSociology.setSelected(true);
        }else{
            checkSociology.setSelected(false);
        }
        
        // Social Work
        if(checkSocialWork.isSelected() == false){
            checkSocialWork.setSelected(true);
        }else{
            checkSocialWork.setSelected(false);
        }
        
        // Criminology
        if(checkCriminology.isSelected() == false){
            checkCriminology.setSelected(true);
        }else{
            checkCriminology.setSelected(false);
        }
        
        // Human Rights
        if(checkHumanRights.isSelected() == false){
            checkHumanRights.setSelected(true);
        }else{
            checkHumanRights.setSelected(false);
        }
        
        // Phsycology
        if(checkPsychology.isSelected() == false){
            checkPsychology.setSelected(true);
        }else{
            checkPsychology.setSelected(false);
        }
        
        // Communication Studies
        if(checkCommunicationStudies.isSelected() == false){
            checkCommunicationStudies.setSelected(true);
        }else{
            checkCommunicationStudies.setSelected(false);
        }
        
        // Human Geography
        if(checkHumanGeography.isSelected() == false){
            checkHumanGeography.setSelected(true);
        }else{
            checkHumanGeography.setSelected(false);
        }
        
        // Algebra
        if(checkAlgebra.isSelected() == false){
            checkAlgebra.setSelected(true);
        }else{
            checkAlgebra.setSelected(false);
        }
        
        // Applied Mathematics
        if(checkAppliedMathematics.isSelected() == false){
            checkAppliedMathematics.setSelected(true);
        }else{
            checkAppliedMathematics.setSelected(false);
        }
        
        // Astronomy
        if(checkAstronomy.isSelected() == false){
            checkAstronomy.setSelected(true);
        }else{
            checkAstronomy.setSelected(false);
        }
        
        // Cell Biology
        if(checkCellBiology.isSelected() == false){
            checkCellBiology.setSelected(true);
        }else{
            checkCellBiology.setSelected(false);
        }
        
        // Combinatorics
        if(checkCombinatorics.isSelected() == false){
            checkCombinatorics.setSelected(true);
        }else{
            checkCombinatorics.setSelected(false);
        }
        
        // Computer Science
        if(checkComputerScience.isSelected() == false){
            checkComputerScience.setSelected(true);
        }else{
            checkComputerScience.setSelected(false);
        }
        
        // Distributed Computing
        if(checkDistributedComputing.isSelected() == false){
            checkDistributedComputing.setSelected(true);
        }else{
            checkDistributedComputing.setSelected(false);
        }
        
        // Environmental Chemistry
        if(checkEnvironmentalChemistry.isSelected() == false){
            checkEnvironmentalChemistry.setSelected(true);
        }else{
            checkEnvironmentalChemistry.setSelected(false);
        }
        
        // General Biology
        if(checkGeneralBiology.isSelected() == false){
            checkGeneralBiology.setSelected(true);
        }else{
            checkGeneralBiology.setSelected(false);
        }
        
        // Graph Theory
        if(checkGraphTheory.isSelected() == false){
            checkGraphTheory.setSelected(true);
        }else{
            checkGraphTheory.setSelected(false);
        }
        
        // Inorganic Chemistry
        if(checkInorganicChemestry.isSelected() == false){
            checkInorganicChemestry.setSelected(true);
        }else{
            checkInorganicChemestry.setSelected(false);
        }
        
        // Mathematics
        if(checkMathematics.isSelected() == false){
            checkMathematics.setSelected(true);
        }else{
            checkMathematics.setSelected(false);
        }
        
        // Operating Systmes
        if(checkOperatingSystems.isSelected() == false){
            checkOperatingSystems.setSelected(true);
        }else{
            checkOperatingSystems.setSelected(false);
        }
        
        // Physics
        if(checkPhysics.isSelected() == false){
            checkPhysics.setSelected(true);
        }else{
            checkPhysics.setSelected(false);
        }
        
        // Space Sciences
        if(checkSpaceSciences.isSelected() == false){
            checkSpaceSciences.setSelected(true);
        }else{
            checkSpaceSciences.setSelected(false);
        }
        
        // Topology
        if(checkTopology.isSelected() == false){
            checkTopology.setSelected(true);
        }else{
            checkTopology.setSelected(false);
        }
        
        // Analytical Chemistry
        if(checkAnalyticalChemistry.isSelected() == false){
            checkAnalyticalChemistry.setSelected(true);
        }else{
            checkAnalyticalChemistry.setSelected(false);
        }
        
        // Artificial Intelligence
        if(checkArtificialIntelligenece.isSelected() == false){
            checkArtificialIntelligenece.setSelected(true);
        }else{
            checkArtificialIntelligenece.setSelected(false);
        }
        
        // Biology
        if(checkBiology.isSelected() == false){
            checkBiology.setSelected(true);
        }else{
            checkBiology.setSelected(false);
        }
        
        // Code
        if(checkCode.isSelected() == false){
            checkCode.setSelected(true);
        }else{
            checkCode.setSelected(false);
        }
        
        // Computer Graphics
        if(checkComputerGraphics.isSelected() == false){
            checkComputerGraphics.setSelected(true);
        }else{
            checkComputerGraphics.setSelected(false);
        }
        
        // Data Structures
        if(checkDataStructures.isSelected() == false){
            checkDataStructures.setSelected(true);
        }else{
            checkDataStructures.setSelected(false);
        }
        
        // Ecology
        if(checkEcology.isSelected() == false){
            checkEcology.setSelected(true);
        }else{
            checkEcology.setSelected(false);
        }
        
        // Game Theory
        if(checkGameTheory.isSelected() == false){
            checkGameTheory.setSelected(true);
        }else{
            checkGameTheory.setSelected(false);
        }
        
        // Geometry
        if(checkGeometry.isSelected() == false){
            checkGeometry.setSelected(true);
        }else{
            checkGeometry.setSelected(false);
        }
        
        // Information Theory
        if(checkInformationTheory.isSelected() == false){
            checkInformationTheory.setSelected(true);
        }else{
            checkInformationTheory.setSelected(false);
        }
        
        // Mathematical Physics
        if(checkMathematicalPhysics.isSelected() == false){
            checkMathematicalPhysics.setSelected(true);
        }else{
            checkMathematicalPhysics.setSelected(false);
        }
        
        // Nutrition
        if(checkNutrition.isSelected() == false){
            checkNutrition.setSelected(true);
        }else{
            checkNutrition.setSelected(false);
        }
        
        // Physical Chemistry
        if(checkPhysicalChemistry.isSelected() == false){
            checkPhysicalChemistry.setSelected(true);
        }else{
            checkPhysicalChemistry.setSelected(false);
        }
        
        // Quantum Computing
        if(checkQuantumComputing.isSelected() == false){
            checkQuantumComputing.setSelected(true);
        }else{
            checkQuantumComputing.setSelected(false);
        }
        
        // Theory Computation
        if(checkTheoryComputation.isSelected() == false){
            checkTheoryComputation.setSelected(true);
        }else{
            checkTheoryComputation.setSelected(false);
        }
        
        // History
        if(checkHistory.isSelected() == false){
            checkHistory.setSelected(true);
        }else{
            checkHistory.setSelected(false);
        }
        
        // Architecture
        if(checkArchitecture.isSelected() == false){
            checkArchitecture.setSelected(true);
        }else{
            checkArchitecture.setSelected(false);
        }
        
        // Asian History
        if(checkAsianHistory.isSelected() == false){
            checkAsianHistory.setSelected(true);
        }else{
            checkAsianHistory.setSelected(false);
        }
        
        // Dance
        if(checkDance.isSelected() == false){
            checkDance.setSelected(true);
        }else{
            checkDance.setSelected(false);
        }
        
        // History Culture
        if(checkHistoryCulture.isSelected() == false){
            checkHistoryCulture.setSelected(true);
        }else{
            checkHistoryCulture.setSelected(false);
        }
        
        // Legal Management
        if(checkLegalManagement.isSelected() == false){
            checkLegalManagement.setSelected(true);
        }else{
            checkLegalManagement.setSelected(false);
        }
        
        // Performing Arts
        if(checkPerformingArts.isSelected() == false){
            checkPerformingArts.setSelected(true);
        }else{
            checkPerformingArts.setSelected(false);
        }
        
        // Television
        if(checkTelevision.isSelected() == false){
            checkTelevision.setSelected(true);
        }else{
            checkTelevision.setSelected(false);
        }
        
        // World History
        if(checkWorldHistory.isSelected() == false){
            checkWorldHistory.setSelected(true);
        }else{
            checkWorldHistory.setSelected(false);
        }
        
        // Administrative Law
        if(checkAdministrativeLaw.isSelected() == false){
            checkAdministrativeLaw.setSelected(true);
        }else{
            checkAdministrativeLaw.setSelected(false);
        }
        
        // Applied Arts
        if(checkAppliedArts.isSelected() == false){
            checkAppliedArts.setSelected(true);
        }else{
            checkAppliedArts.setSelected(false);
        }
        
        // Civil Law
        if(checkCivilLaw.isSelected() == false){
            checkCivilLaw.setSelected(true);
        }else{
            checkCivilLaw.setSelected(false);
        }
        
        // Literature
        if(checkLiterature.isSelected() == false){
            checkLiterature.setSelected(true);
        }else{
            checkLiterature.setSelected(false);
        }
        
        // History Literature
        if(checkHistoryLiterature.isSelected() == false){
            checkHistoryLiterature.setSelected(true);
        }else{
            checkHistoryLiterature.setSelected(false);
        }
        
        // Linguistics
        if(checkLinguistics.isSelected() == false){
            checkLinguistics.setSelected(true);
        }else{
            checkLinguistics.setSelected(false);
        }
        
        // Phylosophy
        if(checkPhylosophy.isSelected() == false){
            checkPhylosophy.setSelected(true);
        }else{
            checkPhylosophy.setSelected(false);
        }
        
        // Theatre
        if(checkTheatre.isSelected() == false){
            checkTheatre.setSelected(true);
        }else{
            checkTheatre.setSelected(false);
        }
        
        
        // World Literature
        if(checkWorldLiterature.isSelected() == false){
            checkWorldLiterature.setSelected(true);
        }else{
            checkWorldLiterature.setSelected(false);
        }
        
        // Nursing
        if(checkNursing.isSelected() == false){
            checkNursing.setSelected(true);
        }else{
            checkNursing.setSelected(false);
        }
        
        // Analysis Structures
        if(checkAnalysisStructures.isSelected() == false){
            checkAnalysisStructures.setSelected(true);
        }else{
            checkAnalysisStructures.setSelected(false);
        }
        
        // Building Materials Theory
        if(checkBuildingMaterialsTheory.isSelected() == false){
            checkBuildingMaterialsTheory.setSelected(true);
        }else{
            checkBuildingMaterialsTheory.setSelected(false);
        }
        
        // Capital Markets
        if(checkCapitalMarkets.isSelected() == false){
            checkCapitalMarkets.setSelected(true);
        }else{
            checkCapitalMarkets.setSelected(false);
        }
        
        // Clinical Physiology
        if(checkClinicalPhysiology.isSelected() == false){
            checkClinicalPhysiology.setSelected(true);
        }else{
            checkClinicalPhysiology.setSelected(false);
        }
        
        // Econometrics
        if(checkEconometrics.isSelected() == false){
            checkEconometrics.setSelected(true);
        }else{
            checkEconometrics.setSelected(false);
        }
        
        // Entrepreneurship
        if(checkEntrepreneurship.isSelected() == false){
            checkEntrepreneurship.setSelected(true);
        }else{
            checkEntrepreneurship.setSelected(false);
        }
        
        // Food Agribusiness
        if(checkFoodAgribusiness.isSelected() == false){
            checkFoodAgribusiness.setSelected(true);
        }else{
            checkFoodAgribusiness.setSelected(false);
        }
        
        // Human Resource
        if(checkHumanResource.isSelected() == false){
            checkHumanResource.setSelected(true);
        }else{
            checkHumanResource.setSelected(false);
        }
        
        // Macroeconomics
        if(checkMacroeconomics.isSelected() == false){
            checkMacroeconomics.setSelected(true);
        }else{
            checkMacroeconomics.setSelected(false);
        }
        
        // Medicine Health
        if(checkMedicineHealth.isSelected() == false){
            checkMedicineHealth.setSelected(true);
        }else{
            checkMedicineHealth.setSelected(false);
        }
        
        // Pharmacology
        if(checkPharmacology.isSelected() == false){
            checkPharmacology.setSelected(true);
        }else{
            checkPharmacology.setSelected(false);
        }
        
        // Structural design
        if(checkStructuralDesign.isSelected() == false){
            checkStructuralDesign.setSelected(true);
        }else{
            checkStructuralDesign.setSelected(false);
        }
        
        // Operations management
        if(checkOperationsManagement.isSelected() == false){
            checkOperationsManagement.setSelected(true);
        }else{
            checkOperationsManagement.setSelected(false);
        }
        
        // Audit
        if(checkAudit.isSelected() == false){
            checkAudit.setSelected(true);
        }else{
            checkAudit.setSelected(false);
        }
        
        // Business
        if(checkBusiness.isSelected() == false){
            checkBusiness.setSelected(true);
        }else{
            checkBusiness.setSelected(false);
        }
        
        // Chemical Engineering
        if(checkChemicalEngineering.isSelected() == false){
            checkChemicalEngineering.setSelected(true);
        }else{
            checkChemicalEngineering.setSelected(false);
        }
        
        // Cryptocurrencies
        if(checkCryptocurrencies.isSelected() == false){
            checkCryptocurrencies.setSelected(true);
        }else{
            checkCryptocurrencies.setSelected(false);
        }
        
        // Educational Technology
        if(checkEducationalTechnology.isSelected() == false){
            checkEducationalTechnology.setSelected(true);
        }else{
            checkEducationalTechnology.setSelected(false);
        }
        
        // Environmental sciences
        if(checkEnvironmentalSciences.isSelected() == false){
            checkEnvironmentalSciences.setSelected(true);
        }else{
            checkEnvironmentalSciences.setSelected(false);
        }
        
        // Hydrology Hydrolic Systems
        if(checkHydrologyHydrolicSystems.isSelected() == false){
            checkHydrologyHydrolicSystems.setSelected(true);
        }else{
            checkHydrologyHydrolicSystems.setSelected(false);
        }
        
        // Management studies
        if(checkManagementStudies.isSelected() == false){
            checkManagementStudies.setSelected(true);
        }else{
            checkManagementStudies.setSelected(false);
        }
        
        // Microeconomics
        if(checkMicroeconomics.isSelected() == false){
            checkMicroeconomics.setSelected(true);
        }else{
            checkMicroeconomics.setSelected(false);
        }
        
        //Physical Education
        if(checkPhysicalEducation.isSelected() == false){
            checkPhysicalEducation.setSelected(true);
        }else{
            checkPhysicalEducation.setSelected(false);
        }
        
        // Business Entertainment
        if(checkBusinessEntertainment.isSelected() == false){
            checkBusinessEntertainment.setSelected(true);
        }else{
            checkBusinessEntertainment.setSelected(false);
        }
        
        // Political science
        if(checkPoliticalScience.isSelected() == false){
            checkPoliticalScience.setSelected(true);
        }else{
            checkPoliticalScience.setSelected(false);
        }
        
        // Archaeology
        if(checkArchaeology.isSelected() == false){
            checkArchaeology.setSelected(true);
        }else{
            checkArchaeology.setSelected(false);
        }
        
        // Education
        if(checkEducation.isSelected() == false){
            checkEducation.setSelected(true);
        }else{
            checkEducation.setSelected(false);
        }
        
        // Economics
        if(checkEconomics.isSelected() == false){
            checkEconomics.setSelected(true);
        }else{
            checkEconomics.setSelected(false);
        }
        
        // Anthropology
        if(checkAnthropology.isSelected() == false){
            checkAnthropology.setSelected(true);
        }else{
            checkAnthropology.setSelected(false);
        }
        
        // Cultural studies
        if(checkCulturalStudies.isSelected() == false){
            checkCulturalStudies.setSelected(true);
        }else{
            checkCulturalStudies.setSelected(false);
        }
        // Tourism
        if(checkTourism.isSelected() == false){
            checkTourism.setSelected(true);
        }else{
            checkTourism.setSelected(false);
        }
        
        // Analysis
        if(checkAnalysis.isSelected() == false){
            checkAnalysis.setSelected(true);
        }else{
            checkAnalysis.setSelected(false);
        }
        
        // Approximation theory
        if(checkApproximationTheory.isSelected() == false){
            checkApproximationTheory.setSelected(true);
        }else{
            checkApproximationTheory.setSelected(false);
        }
        
        // Biochemistry
        if(checkBiochemistry.isSelected() == false){
            checkBiochemistry.setSelected(true);
        }else{
            checkBiochemistry.setSelected(false);
        }
        
        // Chemistry
        if(checkChemistry.isSelected() == false){
            checkChemistry.setSelected(true);
        }else{
            checkChemistry.setSelected(false);
        }
        
        // Computer communications
        if(checkComputerCommunications.isSelected() == false){
            checkComputerCommunications.setSelected(true);
        }else{
            checkComputerCommunications.setSelected(false);
        }
        
        // Cryptography
        if(checkCryptography.isSelected() == false){
            checkCryptography.setSelected(true);
        }else{
            checkCryptography.setSelected(false);
        }
        
        // Earth Science
        if(checkEarthScience.isSelected() == false){
            checkEarthScience.setSelected(true);
        }else{
            checkEarthScience.setSelected(false);
        }
        
        // Geology
        if(checkGeology.isSelected() == false){
            checkGeology.setSelected(true);
        }else{
            checkGeology.setSelected(false);
        }
        
        // Immunology
        if(checkImmunology.isSelected() == false){
            checkImmunology.setSelected(true);
        }else{
            checkImmunology.setSelected(false);
        }
        
        // Mathematical logic
        if(checkMathematicalLogic.isSelected() == false){
            checkMathematicalLogic.setSelected(true);
        }else{
            checkMathematicalLogic.setSelected(false);
        }
        
        // Numerical analysis
        if(checkNumericalAnalysis.isSelected() == false){
            checkNumericalAnalysis.setSelected(true);
        }else{
            checkNumericalAnalysis.setSelected(false);
        }
        
        // Organic chemistry
        if(checkOrganicChemistry.isSelected() == false){
            checkOrganicChemistry.setSelected(true);
        }else{
            checkOrganicChemistry.setSelected(false);
        }
        
        // Programming Languages
        if(checkProgrammingLanguages.isSelected() == false){
            checkProgrammingLanguages.setSelected(true);
        }else{
            checkProgrammingLanguages.setSelected(false);
        }
        
        // Theoretical physics
        if(checkTheoreticalPhysics.isSelected() == false){
            checkTheoreticalPhysics.setSelected(true);
        }else{
            checkTheoreticalPhysics.setSelected(false);
        }
        
        // Algorithms
        if(checkAlgorithms.isSelected() == false){
            checkAlgorithms.setSelected(true);
        }else{
            checkAlgorithms.setSelected(false);
        }
        
        // Applied Physics
        if(checkAppliedPhysics.isSelected() == false){
            checkAppliedPhysics.setSelected(true);
        }else{
            checkAppliedPhysics.setSelected(false);
        }
        
        // Astrophysics
        if(checkAstrophysics.isSelected() == false){
            checkAstrophysics.setSelected(true);
        }else{
            checkAstrophysics.setSelected(false);
        }
        
        // Evolutionary Biology
        if(checkEvolutionaryBiology.isSelected() == false){
            checkEvolutionaryBiology.setSelected(true);
        }else{
            checkEvolutionaryBiology.setSelected(false);
        }
        
        // Computer Architecture
        if(checkComputerArchitecture.isSelected() == false){
            checkComputerArchitecture.setSelected(true);
        }else{
            checkComputerArchitecture.setSelected(false);
        }
        
        // Computer security
        if(checkComputerSecurity.isSelected() == false){
            checkComputerSecurity.setSelected(true);
        }else{
            checkComputerSecurity.setSelected(false);
        }
        
        // Dynamical systems
        if(checkDynamicalSystems.isSelected() == false){
            checkDynamicalSystems.setSelected(true);
        }else{
            checkDynamicalSystems.setSelected(false);
        }
        
        // General chemistry
        if(checkGeneralChemistry.isSelected() == false){
            checkGeneralChemistry.setSelected(true);
        }else{
            checkGeneralChemistry.setSelected(false);
        }
        
        // Human Computer Interaction
        if(checkHumanComputerInteraction.isSelected() == false){
            checkHumanComputerInteraction.setSelected(true);
        }else{
            checkHumanComputerInteraction.setSelected(false);
        }
        
        // Logic in computer science
        if(checkLogicComputerScience.isSelected() == false){
            checkLogicComputerScience.setSelected(true);
        }else{
            checkLogicComputerScience.setSelected(false);
        }
        
        // Operations research
        if(checkOperationsResearch.isSelected() == false){
            checkOperationsResearch.setSelected(true);
        }else{
            checkOperationsResearch.setSelected(false);
        }
        
        // Number Theory
        if(checkNumberTheory.isSelected() == false){
            checkNumberTheory.setSelected(true);
        }else{
            checkNumberTheory.setSelected(false);
        }
        
        // Statistics
        if(checkStatistics.isSelected() == false){
            checkStatistics.setSelected(true);
        }else{
            checkStatistics.setSelected(false);
        }
        
        // Probability theory
        if(checkProbabilityTheory.isSelected() == false){
            checkProbabilityTheory.setSelected(true);
        }else{
            checkProbabilityTheory.setSelected(false);
        }
        
        // Zoology
        if(checkZoology.isSelected() == false){
            checkZoology.setSelected(true);
        }else{
            checkZoology.setSelected(false);
        }
        
       
        
        
    }//GEN-LAST:event_checkAllItemStateChanged

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    private void btnExit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit1MouseClicked

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Do you want to Exit ?", "Exit Confirmation : ",
            JOptionPane.YES_NO_OPTION);

        if (result == JOptionPane.YES_OPTION) {
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        } else if (result == JOptionPane.NO_OPTION) {
            setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnExit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExit2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExit2MouseClicked

    private void btnExit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit2ActionPerformed
        this.setState(clinkLogin.ICONIFIED);
    }//GEN-LAST:event_btnExit2ActionPerformed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        int x = evt.getXOnScreen()-this.x;
        int y = evt.getYOnScreen()-this.y;
        this.setLocation(x,y);
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Subjects.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Subjects().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnExit2;
    private javax.swing.JCheckBox checkAccounting;
    private javax.swing.JCheckBox checkAdministrativeLaw;
    private javax.swing.JCheckBox checkAdvertising;
    private javax.swing.JCheckBox checkAfricanHistory;
    private javax.swing.JCheckBox checkAlgebra;
    private javax.swing.JCheckBox checkAlgorithms;
    private javax.swing.JCheckBox checkAll;
    private javax.swing.JCheckBox checkAmericanHistory;
    private javax.swing.JCheckBox checkAnalysis;
    private javax.swing.JCheckBox checkAnalysisStructures;
    private javax.swing.JCheckBox checkAnalyticalChemistry;
    private javax.swing.JCheckBox checkAncientHistory;
    private javax.swing.JCheckBox checkAnthropology;
    private javax.swing.JCheckBox checkAppliedArts;
    private javax.swing.JCheckBox checkAppliedMathematics;
    private javax.swing.JCheckBox checkAppliedPhysics;
    private javax.swing.JCheckBox checkApproximationTheory;
    private javax.swing.JCheckBox checkArchaeology;
    private javax.swing.JCheckBox checkArchitecture;
    private javax.swing.JCheckBox checkArtDesign;
    private javax.swing.JCheckBox checkArtHistory;
    private javax.swing.JCheckBox checkArtificialIntelligenece;
    private javax.swing.JCheckBox checkAsianHistory;
    private javax.swing.JCheckBox checkAstronomy;
    private javax.swing.JCheckBox checkAstrophysics;
    private javax.swing.JCheckBox checkAudit;
    private javax.swing.JCheckBox checkBiochemistry;
    private javax.swing.JCheckBox checkBiology;
    private javax.swing.JCheckBox checkBlockchain;
    private javax.swing.JCheckBox checkBrandValue;
    private javax.swing.JCheckBox checkBuildingMaterialsTheory;
    private javax.swing.JCheckBox checkBusiness;
    private javax.swing.JCheckBox checkBusinessAnalysis;
    private javax.swing.JCheckBox checkBusinessEntertainment;
    private javax.swing.JCheckBox checkBusinessManagement;
    private javax.swing.JCheckBox checkCapitalMarkets;
    private javax.swing.JCheckBox checkCellBiology;
    private javax.swing.JCheckBox checkChemicalEngineering;
    private javax.swing.JCheckBox checkChemistry;
    private javax.swing.JCheckBox checkChildcare;
    private javax.swing.JCheckBox checkCivilEngineering;
    private javax.swing.JCheckBox checkCivilLaw;
    private javax.swing.JCheckBox checkClinicalPhysiology;
    private javax.swing.JCheckBox checkCode;
    private javax.swing.JCheckBox checkCombinatorics;
    private javax.swing.JCheckBox checkCommunicationStudies;
    private javax.swing.JCheckBox checkComputerArchitecture;
    private javax.swing.JCheckBox checkComputerCommunications;
    private javax.swing.JCheckBox checkComputerGraphics;
    private javax.swing.JCheckBox checkComputerScience;
    private javax.swing.JCheckBox checkComputerSecurity;
    private javax.swing.JCheckBox checkCreativeWriting;
    private javax.swing.JCheckBox checkCriminalLaw;
    private javax.swing.JCheckBox checkCriminology;
    private javax.swing.JCheckBox checkCryptocurrencies;
    private javax.swing.JCheckBox checkCryptography;
    private javax.swing.JCheckBox checkCulturalStudies;
    private javax.swing.JCheckBox checkDance;
    private javax.swing.JCheckBox checkDataStructures;
    private javax.swing.JCheckBox checkDentistry;
    private javax.swing.JCheckBox checkDigitalInnovationTransformation;
    private javax.swing.JCheckBox checkDistributedComputing;
    private javax.swing.JCheckBox checkDynamicalSystems;
    private javax.swing.JCheckBox checkEarthScience;
    private javax.swing.JCheckBox checkEcology;
    private javax.swing.JCheckBox checkEconometrics;
    private javax.swing.JCheckBox checkEconomics;
    private javax.swing.JCheckBox checkEducation;
    private javax.swing.JCheckBox checkEducationalTechnology;
    private javax.swing.JCheckBox checkElectricalEngineering;
    private javax.swing.JCheckBox checkEngineering;
    private javax.swing.JCheckBox checkEnglishLanguage;
    private javax.swing.JCheckBox checkEntrepreneurship;
    private javax.swing.JCheckBox checkEnvironmentalChemistry;
    private javax.swing.JCheckBox checkEnvironmentalSciences;
    private javax.swing.JCheckBox checkEvolutionaryBiology;
    private javax.swing.JCheckBox checkFilm;
    private javax.swing.JCheckBox checkFluidMechanics;
    private javax.swing.JCheckBox checkFoodAgribusiness;
    private javax.swing.JCheckBox checkGameTheory;
    private javax.swing.JCheckBox checkGeneralBiology;
    private javax.swing.JCheckBox checkGeneralChemistry;
    private javax.swing.JCheckBox checkGeology;
    private javax.swing.JCheckBox checkGeometry;
    private javax.swing.JCheckBox checkGraphTheory;
    private javax.swing.JCheckBox checkHealthCare;
    private javax.swing.JCheckBox checkHistory;
    private javax.swing.JCheckBox checkHistoryCulture;
    private javax.swing.JCheckBox checkHistoryLiterature;
    private javax.swing.JCheckBox checkHospitality;
    private javax.swing.JCheckBox checkHumanComputerInteraction;
    private javax.swing.JCheckBox checkHumanGeography;
    private javax.swing.JCheckBox checkHumanResource;
    private javax.swing.JCheckBox checkHumanRights;
    private javax.swing.JCheckBox checkHydrologyHydrolicSystems;
    private javax.swing.JCheckBox checkImmunology;
    private javax.swing.JCheckBox checkInformationTheory;
    private javax.swing.JCheckBox checkInorganicChemestry;
    private javax.swing.JCheckBox checkInvestmentStrategies;
    private javax.swing.JCheckBox checkJurisprudence;
    private javax.swing.JCheckBox checkLaw;
    private javax.swing.JCheckBox checkLegalManagement;
    private javax.swing.JCheckBox checkLinguistics;
    private javax.swing.JCheckBox checkLiterature;
    private javax.swing.JCheckBox checkLogicComputerScience;
    private javax.swing.JCheckBox checkLogistics;
    private javax.swing.JCheckBox checkMacroeconomics;
    private javax.swing.JCheckBox checkManagementStudies;
    private javax.swing.JCheckBox checkMarketing;
    private javax.swing.JCheckBox checkMaterialsScienceEngineering;
    private javax.swing.JCheckBox checkMathematicalLogic;
    private javax.swing.JCheckBox checkMathematicalPhysics;
    private javax.swing.JCheckBox checkMathematics;
    private javax.swing.JCheckBox checkMechanicalEngineering;
    private javax.swing.JCheckBox checkMedicineHealth;
    private javax.swing.JCheckBox checkMicroeconomics;
    private javax.swing.JCheckBox checkModernHistory;
    private javax.swing.JCheckBox checkMoneyBanking;
    private javax.swing.JCheckBox checkMusic;
    private javax.swing.JCheckBox checkNegotiation;
    private javax.swing.JCheckBox checkNumberTheory;
    private javax.swing.JCheckBox checkNumericalAnalysis;
    private javax.swing.JCheckBox checkNursing;
    private javax.swing.JCheckBox checkNutrition;
    private javax.swing.JCheckBox checkOperatingSystems;
    private javax.swing.JCheckBox checkOperationsManagement;
    private javax.swing.JCheckBox checkOperationsResearch;
    private javax.swing.JCheckBox checkOrganicChemistry;
    private javax.swing.JCheckBox checkOther;
    private javax.swing.JCheckBox checkPerformingArts;
    private javax.swing.JCheckBox checkPharmacology;
    private javax.swing.JCheckBox checkPhylosophy;
    private javax.swing.JCheckBox checkPhysicalChemistry;
    private javax.swing.JCheckBox checkPhysicalEducation;
    private javax.swing.JCheckBox checkPhysics;
    private javax.swing.JCheckBox checkPoetry;
    private javax.swing.JCheckBox checkPoliticalScience;
    private javax.swing.JCheckBox checkProbabilityTheory;
    private javax.swing.JCheckBox checkProgrammingLanguages;
    private javax.swing.JCheckBox checkPsychology;
    private javax.swing.JCheckBox checkQuantumComputing;
    private javax.swing.JCheckBox checkRealProperty;
    private javax.swing.JCheckBox checkRussianHistory;
    private javax.swing.JCheckBox checkSocialWork;
    private javax.swing.JCheckBox checkSociology;
    private javax.swing.JCheckBox checkSpaceSciences;
    private javax.swing.JCheckBox checkStatistics;
    private javax.swing.JCheckBox checkStrategyTechnology;
    private javax.swing.JCheckBox checkStructuralDesign;
    private javax.swing.JCheckBox checkTelevision;
    private javax.swing.JCheckBox checkTheatre;
    private javax.swing.JCheckBox checkTheology;
    private javax.swing.JCheckBox checkTheoreticalPhysics;
    private javax.swing.JCheckBox checkTheoryComputation;
    private javax.swing.JCheckBox checkTopology;
    private javax.swing.JCheckBox checkTourism;
    private javax.swing.JCheckBox checkVisualArts;
    private javax.swing.JCheckBox checkWorldHistory;
    private javax.swing.JCheckBox checkWorldLiterature;
    private javax.swing.JCheckBox checkZoology;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton settings_btnBack;
    private javax.swing.JButton subjects_btnSave;
    // End of variables declaration//GEN-END:variables
}
