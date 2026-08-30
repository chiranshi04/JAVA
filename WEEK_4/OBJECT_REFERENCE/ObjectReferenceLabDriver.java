public class ObjectReferenceLabDriver
{
    public static void main(String[] args) throws Exception 
{
        ScoreBox st = new ScoreBox();
        ScoreBox second = st;
        System.out.println(st==second);

        ScoreBox Anotherone = new ScoreBox();
        System.out.println(Anotherone == st);

        st.setScore(25);
        System.out.println(second.getScore());
        ScoreBox.replaceLocally(st);

        System.out.println(st.getScore());

    }
}
