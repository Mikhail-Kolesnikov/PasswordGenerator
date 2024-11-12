import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PasswordHistory {
    private List<String> history;

    public PasswordHistory() {
        history = new ArrayList<>();
    }

    public void addPassword(String password) {
        history.add(password);
    }

    public List<String> getHistory() {
        return history;
    }

    public void printHistory() {
        for (String password : history) {
            System.out.println(password);
        }
    }


    public void setHistory(List<String> history) {
        this.history = history;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordHistory that = (PasswordHistory) o;
        return Objects.equals(history, that.history);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(history);
    }
}
