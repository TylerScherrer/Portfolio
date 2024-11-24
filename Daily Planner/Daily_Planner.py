import sys

from PySide6 import QtWidgets
from Daily_Planner_UI import UserInterface

app = QtWidgets.QApplication(sys.argv)

window = UserInterface()
window.show()

app.exec()