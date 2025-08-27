def mergeIntervals(intervals):
    intervals.sort()
    resultado = [intervals[0]]

    for inicio, fim in intervals[1:]:
        ultimo_inicio, ultimo_fim = resultado[-1]

        if inicio <= ultimo_fim:
            resultado[-1][1] = max(ultimo_fim, fim)
        else:
            resultado.append([inicio, fim])
    
    return resultado

print(mergeIntervals([[1,3],[2,6],[8,10],[15,18]]))
print(mergeIntervals([[1,4],[4,5]]))                 