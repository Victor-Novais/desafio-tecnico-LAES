

def merge_lists(intervals: list[list[int]]) -> list[list[int]]:
    #ordena os intervalos
    intervals.sort(key=lambda x: x[0])

    #lista pra armazenar os intervalos que foram
    merged = []

    for interval in intervals:
        # se a lista de merged estiver vazia ou o intervalo atual não se sobrepuser ao último intervalo em merged
        if not merged or merged[-1][1] < interval[0]:
            merged.append(interval)

        else:

            # se tiver sobreposição, une os ijntervalos
            merged[-1][1] = max(merged[-1][1], interval[1])

    return merged

if __name__ == '__main__':
    #exemplo1
    print(merge_lists([[1,3],[2,6],[8,10],[15,18]]))
    #exemplo2
    print(merge_lists([[1,4],[4,5]]))



