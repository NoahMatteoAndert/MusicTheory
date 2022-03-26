package model;
public class Scale {
    public static final int[] scaleFormula = {2, 2, 1, 2, 2, 2, 1}; 
    public static final SingleNote[] NOTES = {new SingleNote(1, "C") /* etc*/};

    private SingleNote rootNote;
    private Quality quality;
    private Mode[] modesOfScale;

    public Scale(Quality scaleQuality, SingleNote scaleRootNote){
        this.rootNote = scaleRootNote;
        initializeScaleModes();
    }

    private void initializeScaleModes(){
        SingleNote letterForIteration = rootNote;
        for (int formulaValue : scaleFormula) {
            letterForIteration.noteValue
        }
    }

    public Chord getDiatonicChord(int scaleDegree){
        
    }




}
