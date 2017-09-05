package com.example.android.reportcard;

import android.util.Log;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A class that contains all subjects the school offers for grading.
 */

public class ReportCard {

    //Name of student for orientation. In an more elaborate setup first & surname should be in its
    //own "Student" class along with contact information etc.
    private String mName;

    //School year the student has just completed.
    private String mYear;

    /**
     * Subjects to be graded.
     * The German grading system is 1(top mark) - 6 (bottom mark). This is further broken down by
     * adding quarter steps 1 … 1-… 1-2 … 2+ … 2 etc.
     * <p>
     * The code could be extended to allow "/" for classes not taken. This would allow these classes
     * to then be set invisible. Meanwhile this would require additional coding to enable the
     * average to accommodate varying amounts of grades to consider.
     */
    //Languages
    private String mGermanGrade, mEnglishGrade, mFrenchGrade, mLatinGrade,
    //Science & Math
    mMathGrade, mPhysicsGrade, mChemistryGrade, mBiologyGrade, mComputerScienceGrade,
    //Art & Sport
    mSportGrade, mArtGrade, mMusicGrade,
    // World related subjects
    mHistoryGrade, mPoliticsGrade, mGeographyGrade,
    //Religion
    mReligionGrade, mEthicsGrade,
    //Free electives
    mPsychologyGrade, mAstronomyGrade, mPhilosophyGrade;

    /**
     * Constructor for {@link ReportCard} containing
     *
     * @param name                 is the name of the student.
     * @param year                 is the school year the student has just completed.
     * @param germanGrade          is the grade the student received from their German teacher.
     * @param englishGrade         is the grade the student received from their English teacher.
     * @param frenchGrade          is the grade the student received from their French teacher.
     * @param latinGrade           is the grade the student received from their Latin teacher.
     * @param mathGrade            is the grade the student received from their Math teacher.
     * @param physicsGrade         is the grade the student received from their Psychics teacher.
     * @param chemistryGrade       is the grade the student received from their Chemistry teacher.
     * @param biologyGrade         is the grade the student received from their Biology teacher.
     * @param computerSciencegrade is the grade the student received from their Computer Science teacher.
     * @param sportGrade           is the grade the student received from their Sport teacher.
     * @param artGrade             is the grade the student received from their Art teacher.
     * @param musicGrade           is the grade the student received from their Music teacher.
     * @param historyGrade         is the grade the student received from their History teacher.
     * @param politicsGrade        is the grade the student received from their Politics teacher.
     * @param geographyGrade       is the grade the student received from their Geography teacher.
     * @param religionGrade        is the grade the student received from their Religion teacher.
     * @param ethicsGrade          is the grade the student received from their Ethics teacher.
     * @param psychologyGrade      is the grade the student received from their Psycholocy teacher.
     * @param astronomoyGrade      is the grade the student received from their Astronomy teacher.
     * @param philsophyGrade       is the grade the student received from their Philosophy teacher.
     */
    public ReportCard(String name, String year, String germanGrade, String englishGrade,
                      String frenchGrade, String latinGrade, String mathGrade, String physicsGrade,
                      String chemistryGrade, String biologyGrade, String computerSciencegrade,
                      String sportGrade, String artGrade, String musicGrade, String historyGrade,
                      String politicsGrade, String geographyGrade, String religionGrade,
                      String ethicsGrade, String psychologyGrade, String astronomoyGrade,
                      String philsophyGrade) {
        mName = name;
        mYear = year;
        mGermanGrade = germanGrade;
        mEnglishGrade = englishGrade;
        mFrenchGrade = frenchGrade;
        mLatinGrade = latinGrade;
        mMathGrade = mathGrade;
        mPhysicsGrade = physicsGrade;
        mChemistryGrade = chemistryGrade;
        mBiologyGrade = biologyGrade;
        mComputerScienceGrade = computerSciencegrade;
        mSportGrade = sportGrade;
        mMusicGrade = musicGrade;
        mArtGrade = artGrade;
        mHistoryGrade = historyGrade;
        mPoliticsGrade = politicsGrade;
        mGeographyGrade = geographyGrade;
        mReligionGrade = religionGrade;
        mEthicsGrade = ethicsGrade;
        mPsychologyGrade = psychologyGrade;
        mAstronomyGrade = astronomoyGrade;
        mPhilosophyGrade = philsophyGrade;
    }

    // ------ Getters ------
    public String getName() {
        return mName;
    }

    public String getYear() {
        return mYear;
    }

    //Languages
    public String getGermanGrade() {
        return mGermanGrade;
    }

    public String getEnglishGrade() {
        return mEnglishGrade;
    }

    public String getFrenchGrade() {
        return mFrenchGrade;
    }

    public String getLatinGrade() {
        return mLatinGrade;
    }

    //Science & Math
    public String getMathGrade() {
        return mMathGrade;
    }

    public String getPhysicsGrade() {
        return mPhysicsGrade;
    }

    public String getChemistryGrade() {
        return mChemistryGrade;
    }

    public String getBiologyGrade() {
        return mBiologyGrade;
    }

    public String getComputerScienceGrade() {
        return mComputerScienceGrade;
    }

    //Arts & Sport
    public String getSportGrade() {
        return mSportGrade;
    }

    public String getArtGrade() {
        return mArtGrade;
    }

    public String getMusicGrade() {
        return mMusicGrade;
    }

    // World related subjects
    public String getHistoryGrade() {
        return mHistoryGrade;
    }

    public String getPoliticsGrade() {
        return mPoliticsGrade;
    }

    public String getGeographyGrade() {
        return mGeographyGrade;
    }

    //Religion
    public String getReligionGrade() {
        return mReligionGrade;
    }

    public String getEthicsGrade() {
        return mEthicsGrade;
    }

    //Free electives
    public String getPsychologyGrade() {
        return mPsychologyGrade;
    }

    public String getAstronomyGrade() {
        return mAstronomyGrade;
    }

    public String getPhilosophyGrade() {
        return mPhilosophyGrade;
    }


    // ------ Setters  ------
    public void setName(String name) {
        mName = name;
    }

    public void setYear(String year) {
        mYear = year;
    }

    //Languages
    public void setGermanGrade(String germanGrade) {
        mGermanGrade = germanGrade;
    }

    public void setEnglishGrade(String englishGrade) {
        mEnglishGrade = englishGrade;
    }

    public void setFrenchGrade(String frenchGrade) {
        mFrenchGrade = frenchGrade;
    }

    public void setLatinGrade(String latinGrade) {
        mLatinGrade = latinGrade;
    }

    //Science & Math
    public void setMathGrade(String mathGrade) {
        mMathGrade = mathGrade;
    }

    public void setPhysicsGrade(String physicsGrade) {
        mPhysicsGrade = physicsGrade;
    }

    public void setChemistryGrade(String chemistryGrade) {
        mChemistryGrade = chemistryGrade;
    }

    public void setBiologyGrade(String biologyGrade) {
        mBiologyGrade = biologyGrade;
    }

    public void setComputerScienceGrade(String computerScienceGrade) {
        mComputerScienceGrade = computerScienceGrade;
    }

    //Arts & Sport
    public void setSportGrade(String sportGrade) {
        mSportGrade = sportGrade;
    }

    public void setArtGrade(String artGrade) {
        mArtGrade = artGrade;
    }

    public void setMusicGrade(String musicGrade) {
        mMusicGrade = musicGrade;
    }

    // World related subjects
    public void setHistoryGrade(String historyGrade) {
        mHistoryGrade = historyGrade;
    }

    public void setPoliticsGrade(String politicsGrade) {
        mPoliticsGrade = politicsGrade;
    }

    public void setGeographyGrade(String geographyGrade) {
        mGeographyGrade = geographyGrade;
    }

    //Religion
    public void setReligionGrade(String religionGrade) {
        mReligionGrade = religionGrade;
    }

    public void setEthicsGrade(String ethicsGrade) {
        mEthicsGrade = ethicsGrade;
    }

    //Free electives
    public void setPsychologyGrade(String psychologyGrade) {
        mPsychologyGrade = psychologyGrade;
    }

    public void setAstronomyGrade(String astronomyGrade) {
        mAstronomyGrade = astronomyGrade;
    }

    public void setPhilosophyGrade(String philosophyGrade) {
        mPhilosophyGrade = philosophyGrade;
    }

    /**
     * Class containing the two grading systems and their conversion in both directions.
     */
    public static class GradeConverter {

        private static ArrayList<String> mGradeScript;

        private static ArrayList<Integer> mGradeInt;

        private static HashMap<String, Integer> mScriptToInt;

        private static HashMap<Integer, String> mIntToScript;


        // ----- Getters ------
        public ArrayList<String> getGradeScript() {
            return mGradeScript;
        }

        public ArrayList<Integer> getGradeInt() {
            return mGradeInt;
        }

        public HashMap<String, Integer> getScriptToInt() {
            return mScriptToInt;
        }

        public HashMap<Integer, String> getIntToScript() {
            return mIntToScript;
        }

        // ------ Setters ------
        public void setGradeScript(ArrayList<String> mGradeScript) {
            GradeConverter.mGradeScript = mGradeScript;
        }

        public void setGradeInt(ArrayList<Integer> mGradeInt) {
            GradeConverter.mGradeInt = mGradeInt;
        }

        public void setScriptToInt(HashMap<String, Integer> mScriptToInt) {
            GradeConverter.mScriptToInt = mScriptToInt;
        }

        public void setIntToScript(HashMap<Integer, String> mIntToScript) {
            GradeConverter.mIntToScript = mIntToScript;
        }

        /**
         * Creating the grade lists and linking them to the variables
         * (Germany just has to make things complex).
         */
        public GradeConverter() {
            super();

            //A list of all possible grades used in the German system.
            ArrayList<String> gradeScript = new ArrayList<>();
            gradeScript.add("1");
            gradeScript.add("1-");
            gradeScript.add("1-2");
            gradeScript.add("2+");
            gradeScript.add("2");
            gradeScript.add("2-");
            gradeScript.add("2-3");
            gradeScript.add("3+");
            gradeScript.add("3");
            gradeScript.add("3-");
            gradeScript.add("3-4");
            gradeScript.add("4+");
            gradeScript.add("4");
            gradeScript.add("4-");
            gradeScript.add("4-5");
            gradeScript.add("5+");
            gradeScript.add("5");
            gradeScript.add("5-");
            gradeScript.add("5-6");
            gradeScript.add("6+");
            gradeScript.add("6");
            setGradeScript(gradeScript);
            gradeScript = getGradeScript();

            //A list of the grade values without decimal point.
            ArrayList<Integer> gradeInt = new ArrayList<>();
            gradeInt.add(100);
            gradeInt.add(125);
            gradeInt.add(150);
            gradeInt.add(175);
            gradeInt.add(200);
            gradeInt.add(225);
            gradeInt.add(250);
            gradeInt.add(275);
            gradeInt.add(300);
            gradeInt.add(325);
            gradeInt.add(350);
            gradeInt.add(375);
            gradeInt.add(400);
            gradeInt.add(425);
            gradeInt.add(450);
            gradeInt.add(475);
            gradeInt.add(500);
            gradeInt.add(525);
            gradeInt.add(550);
            gradeInt.add(575);
            gradeInt.add(600);
            setGradeInt(gradeInt);
            gradeInt = getGradeInt();


            //A Hashmap converting the grades into values for calculation.
            HashMap<String, Integer> scriptToInt = new HashMap<>();
            //grade as numerical value without decimal point to enable calculations.
            for (int i = 0; i < gradeScript.size(); i++) {
                scriptToInt.put(getGradeScript().get(i), getGradeInt().get(i));
            }
            setScriptToInt(scriptToInt);
            scriptToInt = getScriptToInt();

            //A Hashmap converting the calculated value back into a grade.
            HashMap<Integer, String> intToScript = new HashMap<>();
            //grade as numerical value without decimal point to enable calculations.
            for (int i = 0; i < gradeScript.size(); i++) {
                intToScript.put(getGradeInt().get(i), getGradeScript().get(i));
            }
            setIntToScript(intToScript);
            intToScript = getIntToScript();
        }
    }

    /**
     * Calculating the grade average
     *
     * @return the average to be displayed in the toString() method.
     */
    private String average() {
        GradeConverter gc = new GradeConverter();
        //retrieve the hashmaps needed for the conversion.
        HashMap<String, Integer> scriptToInt = gc.getScriptToInt();
        for (int k = 0; k < scriptToInt.size(); k++) {
            Log.v("average", "scriptToInt" + scriptToInt.get(k));
        }
        HashMap<Integer, String> intToScript = gc.getIntToScript();
        for (int k = 0; k < intToScript.size(); k++) {
            Log.v("average", "intToScript" + intToScript.get(k));
        }

        //Convert all grades and add them together.
        int sum = scriptToInt.get(getGermanGrade()) + scriptToInt.get(getEnglishGrade())
                + scriptToInt.get(getFrenchGrade()) + scriptToInt.get(getLatinGrade())
                + scriptToInt.get(getMathGrade()) + scriptToInt.get(getPhysicsGrade())
                + scriptToInt.get(getChemistryGrade()) + scriptToInt.get(getBiologyGrade())
                + scriptToInt.get(getComputerScienceGrade()) + scriptToInt.get(getSportGrade())
                + scriptToInt.get(getArtGrade()) + scriptToInt.get(getMusicGrade())
                + scriptToInt.get(getHistoryGrade()) + scriptToInt.get(getPoliticsGrade())
                + scriptToInt.get(getGeographyGrade()) + scriptToInt.get(getReligionGrade())
                + scriptToInt.get(getEthicsGrade()) + scriptToInt.get(getPsychologyGrade())
                + scriptToInt.get(getAstronomyGrade()) + scriptToInt.get(getPhilosophyGrade());

        //Calculate the average and round it to the nearest factor of 25 so as to convert it back
        // to gradeScript.
        int averageInt = sum / 20;
        int averageRounded = Math.round(averageInt / 25) * 25;

        String average = intToScript.get(averageRounded);

        return average;
    }

    /**
     * Make stored code readable.
     *
     * @return offers a concatenated string of all the information stored within this class.
     */
    @Override
    public String toString() {

        return "Name: " + getName() +
                "\nYear: " + getYear() +
                "\n-----\nLanguage:\n------\nGerman: " + getGermanGrade() +
                "\nEnglish: " + getEnglishGrade() +
                "\nFrench: " + getFrenchGrade() +
                "\nLatin: " + getLatinGrade() +
                "\n-----\nScience & Math:\n------\nMath: " + getMathGrade() +
                "\nPhysics: " + getPhysicsGrade() +
                "\nChemistry: " + getChemistryGrade() +
                "\nBiology: " + getBiologyGrade() +
                "\nComputer Science: " + getComputerScienceGrade() +
                "\n------\nArts & Sport:\n------\nSport: " + getSportGrade() +
                "\nArt: " + getArtGrade() +
                "\nMusic: " + getMusicGrade() +
                "\n------\nWorld related subjects:\n------\nHistory: " + getHistoryGrade() +
                "\nPolitics: " + getPoliticsGrade() +
                "\nGeography: " + getGermanGrade() +
                "\n------\nRelgion:\n------\nReligion: " + getReligionGrade() +
                "\nEthics: " + getEthicsGrade() +
                "\n------\nFree electives:\n------\nPsychology: " + getPsychologyGrade() +
                "\nAstronomy: " + getAstronomyGrade() +
                "\nPhilospohy: " + getPhilosophyGrade() +
                "\n------\nGrade Average: " + average();
    }
}