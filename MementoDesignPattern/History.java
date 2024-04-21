import java.util.*;
public class History
{
    private final List<TextMemento>mementos = new ArrayList<>();

    public void save(TextMemento memento)
    {
        mementos.add(memento);
    }

    public TextMemento getLastSaved()
    {
        if(mementos.size()>=2)
        {
            return mementos.remove(mementos.size()-2);
        }
        return null;
    }
}