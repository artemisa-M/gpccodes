from sys import stdin, stdout
rl = stdin.readline
wr = stdout.write


def arclen(diametro, angulo):
    pi = 22 / 7
    arc = 0
    if angulo >= 360:
        wr(f'Angulo no puede ser formado')
        return 0
    else:
        arc = (pi * diametro) * (angulo / 360)
        return arc


d = 5000
angle = 140.5
wr(f'{arclen(d,angle)}')