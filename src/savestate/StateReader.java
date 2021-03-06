package savestate;

/**
 * This interface is for classes that need to retrieve information stored within
 * another class (that extends StateSender) when the state of that information
 * changes.
 *
 * The most direct application I've used is for JPanels that only need their
 * data updated when (1) they are in focus and (2) when the data has changed.
 *
 * If implemented, the class should use the overrode loadInfo() method in
 * conjunction with static DataRetrievalManager methods to determine whether
 * reloading data is necessary.
 *
 * @author Japhez
 */
public interface StateReader {

    public void loadInfo();
}
