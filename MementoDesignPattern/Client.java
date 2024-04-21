public class Client
{
    public static void main(String[]args)
     {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Content1");
        history.save(editor.save());

        editor.write("Hello World");
        history.save(editor.save());

        editor.write("Hello Ritik");
        history.save(editor.save());

        //Undo
        editor.restore(history.getLastSaved());
        System.out.println(editor.getContent());   //Hello World;

        editor.restore(history.getLastSaved());
        System.out.println(editor.getContent());//     Conent1

        //Redo
        editor.write("Hello Universe");
        history.save(editor.save());
        System.out.println(editor.getContent()); // hello Universe
     }

}