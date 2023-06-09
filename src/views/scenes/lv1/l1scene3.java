package views.scenes.lv1;
import java.awt.*;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;






public class l1scene3 {

   JFrame frame;
   DrawingRoom draw = new DrawingRoom();

   public l1scene3 () {
   
      frame = new JFrame ("Rise Above Mental Health Simulator: Therapist Session no. 1");
      frame.setSize(1400,800);
      frame.setVisible(true);
      frame.add(draw);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
   }
   
   public class DrawingRoom extends JComponent {
   
      public DrawingRoom () {
      
      }
      public void paint(Graphics g){  
      
      // draws background wall color
      
         Color background = new Color (223,201,187);
         g.setColor(background);
         g.fillRect(0,0,1400,800); 
      
      //transverse wall colour
      
         Color transWall = new Color (230,198,175);
         int[] wallCoords = {225, 353, 1390, 380, 1400, 800, 250, 786, };
         fillShape(g,transWall,wallCoords);
      
      
      // left wall
      
         Color wall = new Color (228,189,158);
         g.setColor(wall);
         g.fillRect(0,0,240,800);         
      // draws face of the main character 
      
         Color skin1 = new Color (219,174,141);
         int[] face1 = {972, 311, 1005, 298, 1031, 281, 1038, 274, 1045, 265, 1062, 248, 1075, 246, 1083, 237, 1092, 225, 1095, 219, 1093, 205, 1090, 199, 1083, 196, 1075, 198, 1070, 202, 1072, 182, 1071, 153, 1063, 133, 1045, 116, 1032, 108, 952, 119, 952, 120, 930, 185, 931, 198, 933, 212, 933, 228, 938, 248, 944, 260, 950, 272, 955, 281, 959, 287, 963, 296, 967, 305};
         fillShape(g,skin1,face1);
      
      // main character neck
      
         Color skin2 = new Color (167,107,79);
         int[] neck1 = {1001, 300, 1019, 290, 1031, 283, 1041, 271, 1047, 261, 1050, 250, 1067, 246, 1076, 243, 1075, 249, 1072, 255, 1065, 267, 1057, 277, 1051, 292, 1043, 305, 1039, 315, 1039, 322, 1041, 328, 1043, 335, 1040, 348, 1034, 348, 1025, 344, 1017, 338, 1009, 333, 1005, 331, 1008, 324, 1010, 315, 1012, 308, 1006, 304, 1001, 302, 1009, 297, 1016, 292, };
         fillShape(g,skin2,neck1);
      
         Color col1 = new Color ( 195,136,104);     
         int[] obj1 = {1073, 252, 1069, 255, 1054, 267, 1047, 276, 1036, 289, 1034, 303, 1033, 316, 1036, 327, 1038, 334, 1038, 341, 1029, 339, 1024, 332, 1015, 329, 1009, 327, 1005, 327, 1001, 330, 995, 339, 996, 347, 1000, 362, 1014, 375, 1036, 384, 1057, 388, 1074, 378, 1087, 367, 1099, 337, 1110, 310, 1106, 282, 1103, 266, 1073, 252, };
         fillShape(g,skin1,obj1);
      
      // draws main character hair
      
         Color col2 = new Color (77,59,47);
         int[] obj2 = {978, 228, 975, 217, 974, 206, 978, 191, 981, 181, 983, 172, 986, 184, 990, 179, 993, 172, 995, 166, 999, 175, 1003, 183, 1007, 191, 1012, 200, 1016, 200, 1014, 192, 1011, 175, 1019, 183, 1023, 189, 1027, 199, 1026, 209, 1027, 218, 1032, 212, 1037, 197, 1041, 205, 1042, 226, 1037, 242, 1046, 239, 1057, 227, 1065, 218, 1066, 208, 1074, 201, 1083, 197, 1095, 223, 1101, 210, 1106, 202, 1112, 212, 1108, 200, 1107, 188, 1122, 191, 1110, 172, 1110, 165, 1119, 169, 1111, 156, 1104, 130, 1102, 113, 1094, 96, 1082, 77, 1063, 71, 1050, 70, 1036, 66, 1028, 62, 1023, 61, 1032, 72, 1012, 71, 990, 82, 970, 90, 944, 111, 949, 110, 938, 126, 935, 124, 921, 129, 922, 134, 914, 180, 931, 209, 932, 201, 930, 190, 934, 181, 940, 172, 942, 163, 971, 222, };
         fillShape(g,col2,obj2); 
      
         Color col3 = new Color (56,46,36);
         int[] obj3 = {988, 116, 986, 140, 992, 138, 988, 154, 985, 166, 987, 186, 991, 175, 993, 167, 993, 157, 1014, 196, 1011, 181, 1011, 173, 1007, 166, 997, 149, 994, 140, 990, 128, 989, 123, 989, 138, 988, 147, 990, 147, };
         fillShape(g,col3,obj3);
      
         Color col4 = new Color (156,102,73);
         int[] obj4 = {1038, 72, 1020, 79, 1002, 86, 968, 104, 952, 117, 950, 125, 948, 139, 929, 181, 927, 191, 925, 178, 919, 164, 914, 163, 912, 172, 909, 188, 910, 174, 913, 161, 917, 151, 924, 140, 939, 125, 943, 117, 946, 110, 959, 104, 976, 91, 983, 86, 996, 80, 1032, 74, 1000, 93, };
         fillShape(g,col4,obj4);
      
      
         int[] obj5 = {1033, 81, 1041, 84, 1056, 86, 1060, 91, 1065, 99, 1072, 93, 1093, 136, 1101, 146, 1109, 155, 1111, 163, 1115, 158, 1104, 130, 1101, 117, 1095, 102, 1086, 92, 1075, 85, 1063, 81, 1045, 78, 1031, 78, 1033, 83, };
         fillShape(g,col4,obj5);
      
         int[] obj6 = {1043, 111, 1047, 121, 1057, 163, 1067, 184, 1065, 200, 1066, 208, 1072, 200, 1077, 197, 1074, 192, 1070, 186, 1065, 172, 1056, 143, 1050, 131, 1047, 115, 1039, 103, };
         fillShape(g,col3,obj6);
         
         
         // main character pants
         
         Color col12 = new Color(24,24,24);
         int[] obj12 = {1050, 604, 1030, 609, 1008, 612, 941, 612, 929, 616, 911, 620, 871, 624, 859, 625, 822, 640, 816, 648, 813, 656, 809, 667, 805, 687, 807, 697, 807, 704, 804, 705, 804, 710, 809, 729, 814, 762, 817, 775, 821, 784, 822, 789, 823, 790, 949, 789, 947, 780, 941, 767, 935, 757, 931, 747, 927, 738, 968, 738, 981, 738, 991, 738, 1003, 737, 1013, 737, 1027, 734, 1043, 733, 1057, 732, 1067, 733, 1084, 734, 1093, 734, 1134, 735, 1147, 735, 1153, 736, 1159, 737, 1157, 746, 1160, 763, 1158, 771, 1153, 786, 1152, 789, 1283, 790, 1285, 782, 1287, 768, 1288, 744, 1288, 735, 1286, 711, 1284, 705, 1281, 697, 1284, 692, 1287, 684, 1292, 680, 1292, 670, 1289, 657, 1281, 644, 1276, 634, 1270, 622, 1268, 619, 1256, 627, 1247, 629, 1230, 630, 1209, 630, 1193, 625, 1184, 622, 1093, 591, 1063, 583, 1032, 582, 1016, 591, };
         fillShape(g,col12,obj12);
         
         Color col13 = new Color (67,54,45);
         int[] obj13 = {887, 622, 891, 632, 898, 639, 920, 655, 934, 664, 943, 674, 975, 697, 984, 707, 942, 702, 923, 691, 904, 675, 892, 671, 888, 677, 878, 670, 864, 661, 864, 664, 874, 676, 875, 681, 873, 692, 865, 698, 872, 708, 899, 788, 839, 791, 837, 779, 833, 766, 816, 725, 811, 713, 807, 700, 805, 688, 805, 675, 808, 668, 809, 661, 813, 653, 819, 644, 844, 633, 866, 629, 882, 627, 888, 625, };
         fillShape(g,col13,obj13);
      
      
      // main character jacket
      
         Color col7 = new Color (42,37,33);
         int[] obj7 = {951, 275, 934, 278, 915, 286, 904, 292, 893, 332, 887, 348, 882, 370, 878, 382, 879, 405, 885, 414, 880, 418, 874, 430, 880, 451, 884, 457, 877, 462, 872, 470, 872, 476, 870, 494, 867, 512, 875, 510, 875, 517, 867, 536, 868, 539, 864, 546, 865, 565, 867, 573, 873, 561, 880, 553, 886, 546, 894, 544, 901, 544, 909, 549, 914, 555, 917, 560, 920, 554, 926, 548, 933, 543, 942, 539, 947, 540, 951, 540, 951, 534, 948, 526, 947, 521, 960, 515, 963, 510, 964, 502, 959, 494, 956, 489, 958, 479, 964, 477, 966, 473, 972, 486, 982, 510, 983, 518, 984, 540, 987, 547, 991, 551, 998, 555, 1005, 560, 1021, 567, 1032, 571, 1042, 574, 1050, 576, 1057, 577, 1048, 570, 1041, 559, 1041, 548, 1041, 541, 1046, 541, 1034, 528, 1026, 517, 1019, 502, 1000, 479, 990, 464, 987, 457, 987, 444, 990, 431, 995, 412, 998, 402, 1001, 396, 1008, 387, 1006, 378, 1007, 373, 1006, 368, 1001, 371, 1006, 367, 1009, 361, 1013, 363, 1008, 358, 1004, 351, 1003, 344, 1005, 335, 1008, 329, 1009, 317, 1010, 310, 1010, 307, 1005, 305, 1003, 303, 999, 301, 989, 306, 981, 307, 976, 309, 971, 311, 968, 306, 964, 298, 961, 291, 956, 281, 951, 275, };
         fillShape(g,col7,obj7); 
         
         int[] obj8 = {1087, 291, 1083, 301, 1078, 312, 1075, 320, 1069, 330, 1064, 334, 1063, 337, 1073, 349, 1072, 354, 1067, 358, 1067, 363, 1076, 382, 1083, 421, 1085, 439, 1100, 504, 1112, 534, 1124, 537, 1130, 541, 1132, 549, 1145, 574, 1155, 571, 1169, 567, 1180, 564, 1187, 563, 1196, 572, 1204, 583, 1211, 600, 1218, 607, 1219, 612, 1208, 638, 1217, 639, 1228, 639, 1240, 639, 1249, 638, 1255, 637, 1257, 631, 1259, 624, 1266, 616, 1271, 610, 1285, 596, 1285, 592, 1279, 582, 1275, 575, 1275, 572, 1278, 567, 1282, 562, 1288, 555, 1283, 548, 1280, 541, 1283, 536, 1285, 531, 1287, 526, 1289, 518, 1288, 510, 1288, 500, 1288, 491, 1288, 481, 1291, 478, 1291, 474, 1289, 469, 1286, 463, 1284, 459, 1285, 452, 1287, 441, 1289, 434, 1290, 427, 1292, 421, 1291, 411, 1291, 404, 1289, 396, 1288, 387, 1289, 382, 1287, 375, 1284, 369, 1283, 366, 1283, 360, 1281, 347, 1265, 302, 1256, 295, 1246, 288, 1232, 283, 1219, 278, 1176, 262, 1164, 258, 1146, 255, 1133, 252, 1114, 241, 1105, 236, 1102, 233, 1095, 228, 1085, 236, 1082, 238, 1078, 242, 1077, 249, 1077, 254, 1077, 260, 1077, 266, 1078, 270, 1081, 264, 1086, 260, 1088, 257,};
         fillShape(g,col7,obj8);  
         
         
         
         
         
         // main character t shirt
         
         Color col9 = new Color ( 204,185,169);  
         int[] obj9 = {1013, 364, 1020, 369, 1026, 370, 1034, 372, 1043, 372, 1051, 372, 1058, 368, 1064, 364, 1066, 362, 1068, 370, 1072, 377, 1078, 393, 1081, 405, 1084, 419, 1086, 429, 1089, 445, 1089, 457, 1091, 468, 1092, 474, 1097, 489, 1104, 513, 1105, 521, 1107, 530, 1111, 532, 1118, 534, 1126, 536, 1134, 550, 1136, 556, 1145, 570, 1147, 573, 1140, 574, 1135, 575, 1129, 577, 1113, 579, 1094, 579, 1085, 579, 1077, 579, 1072, 578, 1069, 573, 1064, 569, 1059, 564, 1053, 558, 1045, 553, 1042, 548, 1040, 530, 1030, 518, 1023, 506, 1018, 499, 1015, 494, 1011, 489, 1005, 483, 1001, 478, 994, 471, 991, 463, 987, 455, 988, 444, 989, 436, 991, 430, 994, 424, 995, 416, 998, 409, 1001, 403, 1002, 398, 1006, 396, 1010, 390, 1008, 388, 1007, 387, 1006, 381, 1006, 370, 1006, 367, 1006, 364, 1010, 364, 1015, 367, 1021, 370, 1033, 373, 1040, 373, 1048, 372, 1054, 370, 1059, 368, };
         fillShape(g,col9,obj9);
         
         // main character arms
         
         int[] arm1 = {1178, 565, 1171, 568, 1159, 570, 1146, 574, 1136, 576, 1118, 578, 1105, 579, 1074, 581, 1064, 580, 1051, 577, 1041, 576, 1027, 568, 1012, 564, 1003, 560, 998, 559, 994, 560, 984, 565, 955, 582, 936, 595, 939, 600, 947, 604, 952, 607, 960, 609, 967, 606, 976, 606, 978, 608, 980, 612, 993, 619, 1002, 625, 1010, 628, 1018, 631, 1027, 626, 1034, 622, 1043, 620, 1054, 620, 1066, 621, 1075, 624, 1087, 626, 1101, 630, 1127, 634, 1142, 636, 1154, 637, 1166, 640, 1185, 643, 1194, 643, 1201, 642, 1204, 638, 1209, 633, 1215, 624, 1218, 618, 1218, 614, 1214, 610, 1209, 603, 1204, 586, 1196, 574, 1190, 568, 1186, 564, 1185, 562, };
         int[] arm2 = {898, 542, 891, 546, 884, 548, 873, 559, 869, 566, 868, 575, 869, 584, 877, 598, 879, 602, 879, 614, 882, 621, 887, 623, 894, 623, 900, 623, 908, 624, 916, 629, 925, 630, 930, 625, 933, 621, 937, 618, 942, 616, 950, 614, 960, 610, 950, 604, 946, 590, 941, 585, 935, 581, 926, 576, 918, 574, 911, 571, 910, 563, 913, 559, 916, 558, 915, 556, 891, 545, 885, 548, 880, 552, 873, 562, 869, 567,};
         fillShape(g,skin1,arm1);
         fillShape(g,skin1,arm2);
         
         // main character object being held
         
         Color col11 = new Color (177,159,145);
         int[] obj11 = {999, 560, 989, 566, 981, 570, 971, 572, 962, 579, 953, 584, 945, 587, 941, 583, 935, 580, 921, 577, 915, 574, 916, 562, 920, 558, 925, 549, 934, 542, 945, 540, 961, 539, 972, 539, 979, 543, 987, 546, 997, 558, 995, 560, 990, 561, 982, 565, 977, 571, };
         fillShape(g,col11,obj11);
         
          
      // therapist face
      
         int[] obj14 = {217, 287, 226, 288, 239, 291, 247, 291, 263, 296, 272, 305, 280, 312, 307, 343, 310, 332, 307, 325, 306, 323, 312, 318, 318, 313, 322, 309, 325, 308, 328, 305, 331, 303, 338, 308, 346, 312, 356, 314, 366, 318, 372, 319, 377, 319, 383, 308, 386, 303, 390, 297, 391, 291, 396, 284, 400, 280, 402, 270, 402, 265, 402, 263, 406, 261, 416, 257, 417, 251, 414, 246, 401, 221, 401, 217, 402, 211, 403, 203, 407, 195, 410, 191, 413, 186, 416, 181, 416, 167, 412, 145, 402, 116, 356, 90, 303, 79, 261, 84, 238, 101, 214, 133, 226, 162, 236, 203, 244, 231, 247, 254, 235, 266, 226, 279, 225, 284, 222, 287, 218, 288, 228, 288, 238, 289, 246, 291, 256, 293, 263, 296, };
         fillShape(g,skin1,obj14);
      
      //therapist hair
      
         Color col15 = new Color ( 66,47,42);  
         int[] obj15 = {387, 69, 400, 78, 405, 87, 416, 103, 430, 163, 427, 176, 425, 198, 422, 205, 418, 191, 415, 178, 413, 177, 407, 190, 406, 200, 403, 207, 399, 196, 399, 184, 397, 174, 395, 162, 394, 154, 370, 197, 362, 227, 354, 274, 350, 309, 352, 318, 353, 324, 346, 315, 338, 310, 334, 300, 331, 286, 327, 313, 322, 305, 321, 296, 321, 284, 320, 274, 316, 253, 310, 274, 313, 173, 308, 166, 300, 164, 287, 181, 294, 215, 297, 220, 284, 233, 276, 268, 271, 261, 270, 254, 251, 292, 249, 289, 249, 283, 250, 267, 249, 260, 247, 256, 243, 261, 228, 281, 221, 286, 217, 286, 211, 284, 204, 284, 198, 285, 194, 285, 191, 285, 195, 279, 201, 273, 202, 266, 205, 258, 205, 249, 203, 235, 196, 241, 190, 247, 186, 254, 183, 252, 186, 244, 192, 237, 194, 211, 192, 201, 189, 191, 183, 174, 179, 182, 177, 188, 176, 167, 176, 157, 193, 115, 202, 104, 206, 100, 254, 57, 269, 50, 306, 46, 312, 45, 331, 49, 340, 52, 356, 56, 371, 61, 377, 64, 384, 66, };
         fillShape(g,col15,obj15);
      
      // therapist paper holding
      
         Color col20 = new Color (162,162,162);
      
         int[] obj20 = {750, 537, 748, 545, 744, 553, 737, 562, 733, 566, 731, 570, 742, 571, 756, 572, 771, 575, 788, 580, 801, 581, 794, 593, 784, 600, 773, 611, 765, 618, 751, 630, 743, 638, 730, 649, 718, 662, 711, 669, 698, 683, 682, 701, 672, 714, 661, 723, 650, 737, 629, 759, 618, 768, 606, 781, 601, 782, 589, 779, 575, 776, 549, 768, 539, 766, 527, 763, 500, 773, 455, 737, 411, 702, 274, 583, 354, 586, 389, 600, 426, 607, 434, 603, 438, 600, 445, 596, 451, 593, 460, 590, 470, 579, 481, 572, 492, 567, 502, 558, 516, 553, 527, 546, 540, 540, 550, 533, 568, 530, 584, 523, 607, 521, 625, 518, 642, 518, 663, 518, 681, 521, 697, 524, 714, 527, 730, 530, 743, 534, 748, 538, 751, 538, 747, 545, 740, 549, 738, 557, };
         fillShape(g,col20,obj20);
      
      
      // therapist arm
      
         int[] obj17 = {516, 671, 512, 674, 515, 682, 519, 692, 532, 719, 538, 718, 543, 718, 550, 718, 557, 715, 562, 712, 566, 709, 567, 703, 583, 686, 590, 683, 599, 680, 609, 677, 619, 674, 628, 667, 630, 661, 635, 654, 633, 650, 635, 645, 638, 642, 640, 637, 637, 633, 634, 629, 635, 626, 638, 622, 639, 615, 632, 615, 628, 615, 627, 611, 613, 605, 582, 607, 563, 623, 541, 660, 525, 665, 519, 668, 507, 675, };
         fillShape(g,skin1,obj17);
      
      //therapist t-shirt
      
         Color col16 = new Color (164,123,93);
         int[] obj16 = {171, 288, 181, 288, 190, 286, 198, 285, 211, 285, 224, 287, 236, 288, 249, 290, 260, 293, 270, 299, 280, 305, 290, 311, 303, 316, 314, 324, 325, 332, 336, 344, 335, 354, 338, 363, 339, 372, 348, 378, 355, 383, 370, 391, 391, 413, 400, 426, 413, 455, 416, 466, 419, 476, 416, 487, 419, 498, 422, 521, 421, 531, 425, 549, 429, 558, 430, 568, 431, 586, 434, 597, 438, 608, 447, 638, 451, 651, 454, 663, 453, 666, 459, 668, 465, 670, 470, 677, 477, 680, 489, 677, 496, 675, 505, 672, 513, 668, 518, 666, 520, 671, 525, 677, 530, 690, 536, 695, 539, 733, 539, 741, 532, 749, 528, 758, 513, 770, 497, 777, 489, 781, 424, 790, 415, 790, 399, 785, 372, 770, 361, 763, 368, 772, 346, 783, 347, 787, 225, 790, 218, 771, 214, 753, 208, 735, 201, 714, 197, 696, 193, 680, 181, 657, 173, 636, 165, 617, 155, 592, 142, 585, 122, 578, 106, 575, 75, 566, 68, 560, 60, 536, 56, 524, 54, 516, 48, 506, 51, 479, 52, 467, 53, 429, 59, 406, 63, 397, 76, 376, 87, 364, 101, 351, 118, 336, 125, 335, 132, 332, 139, 325, 145, 318, 153, 318, 159, 315, 164, 307, 166, 300, 168, 296, 171, 293, 174, 290, 195, 285, 205, 285, 217, 286, };
         fillShape(g,col16,obj16);
      
      //therapist chair
      
         Color col18 = new Color(64,55,50);
         int[] obj18 = {64, 549, 86, 552, 92, 557, 118, 569, 126, 572, 136, 575, 143, 577, 150, 579, 158, 589, 164, 596, 169, 603, 178, 622, 182, 633, 197, 667, 203, 680, 207, 695, 211, 711, 214, 726, 222, 743, 224, 766, 230, 782, 231, 787, 133, 790, 131, 781, 129, 772, 127, 765, 124, 757, 121, 747, 119, 735, 115, 726, 108, 711, 105, 702, 101, 694, 94, 682, 92, 674, 84, 654, 77, 646, 72, 636, 70, 629, 63, 618, 59, 615, 53, 607, 46, 600, 35, 596, 27, 589, 26, 584, 28, 582, 30, 579, 33, 577, 36, 577, 40, 577, 48, 577, 56, 581, 60, 584, 62, 584, 61, 579, 59, 575, 57, 571, 57, 565, 57, 562, 60, 560, 62, 558, 65, 555, 66, 551, 70, 551, 74, 552, 79, 554, };
         fillShape(g,col18,obj18);
      
         Color col19 = new Color (18,14,11);
         int[] obj19 = {60, 560, 58, 573, 61, 579, 71, 604, 75, 610, 87, 619, 93, 626, 98, 637, 101, 647, 107, 662, 111, 672, 116, 686, 120, 696, 135, 740, 145, 779, 150, 790, 167, 788, 159, 762, 148, 730, 113, 625, 107, 603, 104, 597, 102, 591, 112, 595, 119, 595, 127, 600, 140, 627, 137, 602, 135, 589, 125, 588, 117, 585, 105, 582, 99, 580, 88, 575, 80, 573, 72, 570, 66, 568, 60, 567, 55, 564, 55, 566, 55, 568, };
         fillShape(g,col19,obj19);
      
      
      
      
      
      }
      
      public void fillShape (Graphics g, Color tempColor, int[] coords ) { // method to simplify the polygon drawing in Java. draws polygons based off coordinates inputted         
         boolean isX = true;
         List<Integer> polyX = new ArrayList<>();
         List<Integer> polyY = new ArrayList<>();
      
         for (int k = 0; k < coords.length; k++){
         
            if (isX){
            
               polyX.add(coords[k]);
               isX = false;
            
            }
            else {
               polyY.add(coords[k]);
               isX=true;
            
            }
            
         }
         
         int[] arrayPolyX = polyX.stream().mapToInt(Integer::intValue).toArray();
         int[] arrayPolyY = polyY.stream().mapToInt(Integer::intValue).toArray();
         
         g.setColor(tempColor);
      
         g.fillPolygon(arrayPolyX, arrayPolyY, arrayPolyX.length);         
      
      
      }
      
      
      public void drawFillShape ( Graphics g, Color tempColor, int[] coords) {
      
         boolean isX = true;
         List<Integer> polyX = new ArrayList<>();
         List<Integer> polyY = new ArrayList<>();
      
         for (int k = 0; k < coords.length; k++){
         
            if (isX){
            
               polyX.add(coords[k]);
               isX = false;
            
            }
            else {
               polyY.add(coords[k]);
               isX=true;
            
            }
            
         }
         
         int[] arrayPolyX = polyX.stream().mapToInt(Integer::intValue).toArray();
         int[] arrayPolyY = polyY.stream().mapToInt(Integer::intValue).toArray();
         
         g.setColor(tempColor);
      
         g.fillPolygon(arrayPolyX, arrayPolyY, arrayPolyX.length); 
         
         g.setColor(Color.black);
         g.drawPolygon(arrayPolyX, arrayPolyY, arrayPolyX.length);    
      
      
      }
   }
   
   
   
   public static void main (String [] args) {
   
      new l1scene3();
   }



}
