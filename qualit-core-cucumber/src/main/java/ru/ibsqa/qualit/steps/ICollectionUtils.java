package ru.ibsqa.qualit.steps;

import org.apache.commons.lang3.tuple.Pair;
import ru.ibsqa.qualit.converters.FieldValueTable;
import ru.ibsqa.qualit.evaluate.IEvaluateManager;

import java.util.List;
import java.util.stream.Collectors;

public interface ICollectionUtils {
    /**
     * Преобразовать List<FieldValueTable> со столбцами field и value в List
     * @param conditions
     * @return
     */
    default List<Pair<String,String>> parsePairs(List<FieldValueTable> conditions, IEvaluateManager evaluateManager) {
        return conditions.stream()
                .map(fieldValue -> Pair.of(fieldValue.getField(), evaluateManager.evalVariable(fieldValue.getValue()).toString()))
                .collect(Collectors.toList());
    }
}
