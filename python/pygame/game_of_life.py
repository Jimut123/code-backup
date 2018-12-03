import  sys, math
import numpy as np
from random import randint
from PyQt5.QtCore import Qt, QBasicTimer
from PyQt5.QtGui import QColor, QPainter
from PyQt5.QtWidgets import QApplication, QWidget, QMainWindow, QMessageBox


class GameOfLife(QMainWindow):
    def __init__(self):
        super().__init__()
        self.maze = Maze(self)
        self.setCentralWidget(self.maze)
        self.setFixedSize(400, 400)
        self.setWindowTitle('Game Of Life')
        self.show()


class Maze(QWidget):

    MazeSize = 50
    Speed = 300
    AliveColor = QColor(30, 139, 195)
    DeadColor = QColor(255, 255, 255)

    def __init__(self, parent):
        super().__init__(parent)
        self.maze = np.random.randint(2, size=(self.MazeSize, self.MazeSize), dtype=int)

        # self.maze = np.zeros(shape=(self.MazeSize, self.MazeSize),dtype=int)
        # self.maze[1:5,1:5]=1
        self.timer = QBasicTimer()
        self.setFocusPolicy(Qt.StrongFocus)
        self.timer.start(self.Speed, self)

    def squareWidth(self):
        return self.contentsRect().width() // Maze.MazeSize

    def squareHeight(self):
        return self.contentsRect().height() // Maze.MazeSize

    def changeColor(self):
        self.AliveColor = QColor(randint(0, 255), randint(0, 255), randint(0, 255))

    def paintEvent(self, QPaintEvent):
        qp = QPainter()
        qp.begin(self)
        self.drawMaze(qp)
        qp.end()

    def timerEvent(self, *args, **kwargs):
        self.iterate()

    def keyPressEvent(self, event):
        key = event.key()
        if key == Qt.Key_Up:
            self.Speed -= 20
            self.timer.stop()
            self.timer.start(self.Speed, self)
        elif key == Qt.Key_Down:
            self.Speed += 20
            self.timer.stop()
            self.timer.start(self.Speed, self)
        elif key == Qt.Key_Left or key == Qt.Key_Right:
            self.changeColor()

    def aliveNeighbours(self, i, j):
        count = 0
        for x in range(max(i-1, 0), min(i+2, self.MazeSize)):
            for y in range(max(j-1, 0), min(j+2, self.MazeSize)):
                if self.maze[x, y] == 1:
                    count += 1
        if self.maze[i, j] == 1:
            count -= 1
        return count

    def iterate(self):
        newmaze = np.zeros(self.maze.shape)
        for i in range(self.MazeSize):
            for j in range(self.MazeSize):
                if self.maze[i, j] == 1:  # currently alive cells
                    if 2 <= self.aliveNeighbours(i, j) <= 3:
                        newmaze[i, j] = 1
                elif self.maze[i, j] == 0:  # currently dead cells
                    if self.aliveNeighbours(i, j) == 3:
                        newmaze[i, j] = 1
        print(self.Speed)
        self.maze = newmaze
        self.update()

    def drawMaze(self, qp):
        for i in range(self.MazeSize):
            for j in range(self.MazeSize):
                if self.maze[i, j] == 1:
                    self.drawBox(qp, self.AliveColor, i*self.squareWidth(), j*self.squareHeight())
                else:
                    self.drawBox(qp, self.DeadColor, i*self.squareWidth(), j*self.squareHeight())

    def drawBox(self, qp, color, x, y):
        qp.setPen(color)
        qp.setBrush(color)
        qp.drawRect(x, y, self.squareWidth(), self.squareHeight())


if __name__ == '__main__':
    app = QApplication([])
    game = GameOfLife()
    sys.exit(app.exec_())

