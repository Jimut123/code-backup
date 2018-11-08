    #include <QApplication>
     #include <QLabel>
     int main(int argc, char *argv[])
     {
         QApplication app(argc, argv);
         QLabel *hello = new QLabel("This is a simple window");
         hello.resize(100, 30);
         hello.show();
         return app.exec();
     }
