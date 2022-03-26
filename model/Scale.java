package model;
public class Scale {
    public static final int[] scaleFormula = {2, 2, 1, 2, 2, 2, 1}; 

    private Note rootNote;
    private Quality quality;
    private Mode[] modesOfScale;

    public Scale(Quality scaleQuality, Note scaleRootNote){
        this.rootNote = scaleRootNote;
        initializeScaleChords();
    }

    private void initializeScaleModes(){
        for (int formulaValue : scaleFormula) {
            
        }
    }

    public Chord getDiatonicChord(int scaleDegree){
        
    }




}
