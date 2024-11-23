# -*- coding: utf-8 -*-

################################################################################
## Form generated from reading UI file 'Fitness_UI.ui'
##
## Created by: Qt User Interface Compiler version 6.5.1
##
## WARNING! All changes made in this file will be lost when recompiling UI file!
################################################################################

from PySide6.QtCore import (QCoreApplication, QDate, QDateTime, QLocale,
    QMetaObject, QObject, QPoint, QRect,
    QSize, QTime, QUrl, Qt)
from PySide6.QtGui import (QBrush, QColor, QConicalGradient, QCursor,
    QFont, QFontDatabase, QGradient, QIcon,
    QImage, QKeySequence, QLinearGradient, QPainter,
    QPalette, QPixmap, QRadialGradient, QTransform)
from PySide6.QtWidgets import (QApplication, QLabel, QLineEdit, QMainWindow,
    QMenuBar, QPushButton, QSizePolicy, QStatusBar,
    QWidget)

class Ui_Display(object):
    def setupUi(self, Display):
        if not Display.objectName():
            Display.setObjectName(u"Display")
        Display.resize(800, 600)
        self.centralwidget = QWidget(Display)
        self.centralwidget.setObjectName(u"centralwidget")
        self.lineEdit = QLineEdit(self.centralwidget)
        self.lineEdit.setObjectName(u"lineEdit")
        self.lineEdit.setGeometry(QRect(60, 430, 491, 111))
        self.Add = QPushButton(self.centralwidget)
        self.Add.setObjectName(u"Add")
        self.Add.setGeometry(QRect(60, 390, 75, 23))
        self.Subtract = QPushButton(self.centralwidget)
        self.Subtract.setObjectName(u"Subtract")
        self.Subtract.setGeometry(QRect(180, 390, 75, 23))
        self.pushButton_3 = QPushButton(self.centralwidget)
        self.pushButton_3.setObjectName(u"pushButton_3")
        self.pushButton_3.setGeometry(QRect(290, 390, 75, 23))
        self.label = QLabel(self.centralwidget)
        self.label.setObjectName(u"label")
        self.label.setGeometry(QRect(80, 190, 471, 121))
        Display.setCentralWidget(self.centralwidget)
        self.menubar = QMenuBar(Display)
        self.menubar.setObjectName(u"menubar")
        self.menubar.setGeometry(QRect(0, 0, 800, 21))
        Display.setMenuBar(self.menubar)
        self.statusbar = QStatusBar(Display)
        self.statusbar.setObjectName(u"statusbar")
        Display.setStatusBar(self.statusbar)

        self.retranslateUi(Display)

        QMetaObject.connectSlotsByName(Display)
    # setupUi

    def retranslateUi(self, Display):
        Display.setWindowTitle(QCoreApplication.translate("Display", u"MainWindow", None))
        self.Add.setText(QCoreApplication.translate("Display", u"Add", None))
        self.Subtract.setText(QCoreApplication.translate("Display", u"Subtract", None))
        self.pushButton_3.setText(QCoreApplication.translate("Display", u"Display", None))
        self.label.setText(QCoreApplication.translate("Display", u"TextLabel", None))
    # retranslateUi

