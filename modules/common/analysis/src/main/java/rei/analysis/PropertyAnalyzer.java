package rei.analysis;

import rei.common.PropertyAddress;

public interface PropertyAnalyzer {
    PropertyAnalysisReport analyze(PropertyAddress property);
}
