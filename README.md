ChineseChess 中国象棋AI版,可以与电脑对弈或双人对弈，目前正在开发联网。  
增加Log输出功能  
增加可选导入功能  
增加种子导入和种子导出功能  
增加将军提示  
将电脑红方与电脑黑方统一为切换电脑方，增加双人对战  
下载源代码自行构建/运行(启动类com.pj.chess.ChessBoardMain) 或下载Release: https://github.com/TalexCalexK0133/ChineseChess/releases/latest   
**运行请务必使用命令行(windows)/终端(macos)，否则无法使用完整功能**//java -jar ChineseChess.jar  
**请不要使用该软件进行作弊行为，否则后果自负**  


依赖: log4j2(2.19.0)(没写好，可以不用，但要删除相关代码)  
依赖: Java EE 6  

Forked from pengjiu/ChineseChess  

增加与修改:  
1.增加AI运算与后台思考的输出界面  
2.增加报错输出界面与日志输出界面  
3.取消HASH表的选项  
4.由"切换电脑方"选项替换"电脑红方"选项、"电脑黑方"选项  
5.增加"双人对战"选项  
6.导入功能从打开弹出对话框改到"游戏"菜单内选项  
7.增加"种子"概念，增加"种子导入""种子导出"功能，可以由一条文本导入和导出对局  
8.悔棋会多悔棋一步，在与电脑对战时方便很多  
9.以下行为将会被日志记录:  
(1)打开软件  
(2)悔棋  
(3)导出种子  
(4)导入种子  
(5)游戏结束  
(6)后台思考的切换  
(7)音效的切换  
(8)程序错误  
10.以下行为将会被AI运算输出:  
(1)AI走子运算  
(2)后台思考运算  

使用本程序或源码造成的任何后果由使用者承担
