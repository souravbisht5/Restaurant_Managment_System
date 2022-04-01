import java.math.BigDecimal;
import java.util.Map;

public class Receipes{

    private String receipeName;
    private Map<String, BigDecimal> ingredUsing;

    public Receipes(String receipeName, Map<String, BigDecimal> ingredUsed) {
        this.receipeName = receipeName;
        this.ingredUsing = ingredUsed;
    }

    public String getReceipeName() {
        return receipeName;
    }

    public void setReceipeName(String receipeName) {
        this.receipeName = receipeName;
    }

    public Map<String, BigDecimal> getIngredUsed() {
        return ingredUsing;
    }

    public void setIngredUsed(Map<String, BigDecimal> ingredUsed) {
        this.ingredUsing = ingredUsed;
    }
}
