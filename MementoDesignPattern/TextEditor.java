public class TextEditor
{
    private String content;

    public void write(String content)
    {
        this.content = content;
    }

    public String getContent()
    {
        return content;
    }

    public TextMemento save()
    {
        return new TextMemento(content);
    }
    public  void restore(TextMemento memento)
    {
        this.content = memento.getContent();
    }
}