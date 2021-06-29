package br.com.meli.day4.LaCiqui;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Guests> g = new ArrayList<>();

        g.add(new Meli("Caio"));
        g.add(new Standart("Max"));
        g.add(new Meli("João"));
        g.add(new Meli("Maria"));
        g.add(new Standart("Enzo"));

        List<Firework> f1 = new ArrayList<>();

        String[] ascFire = new String[3];

        ascFire[0] = "                                  .''.       \n" +
                "       .''.      .        *''*    :_\\/_:     . \n" +
                "      :_\\/_:   _\\(/_  .:.*_\\/_*   : /\\ :  .'.:.'.\n" +
                "  .''.: /\\ :   ./)\\   ':'* /\\ * :  '..'.  -=:o:=-\n" +
                " :_\\/_:'.:::.    ' *''*    * '.\\'/.' _\\(/_'.':'.'\n" +
                " : /\\ : :::::     *_\\/_*     -= o =-  /)\\    '  *\n" +
                "  '..'  ':::'     * /\\ *     .'/.\\'.   '\n" +
                "      *            *..*         :\n" +
                "        *\n" +
                "        *";

        ascFire[1] = "           .\n" +
                "         .* *.               `o`o`\n" +
                "         *. .*              o`o`o`o      ^,^,^\n" +
                "           * \\               `o`o`     ^,^,^,^,^\n" +
                "              \\     ***        |       ^,^,^,^,^\n" +
                "               \\   *****       |        /^,^,^\n" +
                "                \\   ***        |       /\n" +
                "    ~@~*~@~      \\   \\         |      /\n" +
                "  ~*~@~*~@~*~     \\   \\        |     /\n" +
                "  ~*~@   @~*~      \\   \\       |    /     #$#$#      .`'.;.\n" +
                "  ~*~@~*~@~*~       \\   \\      |   /     #$#$#$#    .`,.',\n" +
                "    ~@~*~@~ \\        \\   \\     |  /      /#$#$#     `.,'\n" +
                "_____________\\________\\___\\____|_/______/____________||______\n" ;
        ascFire[2] = "             *    *\n" +
                "   *         '       *       .  *   '     .           * *\n" +
                "                                                               '\n" +
                "       *                *'          *          *        '\n" +
                "   .           *               |               /\n" +
                "               '.         |    |      '       |   '     *\n" +
                "                 \\*        \\   \\             /\n" +
                "       '          \\     '* |    |  *        |*                *  *\n" +
                "            *      `.       \\   |     *     /    *      '\n" +
                "  .                  \\      |   \\          /               *\n" +
                "     *'  *     '      \\      \\   '.       |\n" +
                "        -._            `                  /         *\n" +
                "  ' '      ``._   *                           '          .      '\n" +
                "   *           *\\*          * .   .      *\n" +
                "*  '        *    `-._                       .         _..:='        *\n" +
                "             .  '      *       *    *   .       _.:--'\n" +
                "          *           .     .     *         .-'         *\n" +
                "   .               '             . '   *           *         .\n" +
                "  *       ___.-=--..-._     *                '               '\n" +
                "                                  *       *\n" +
                "                *        _.'  .'       `.        '  *             *\n" +
                "     *              *_.-'   .'            `.               *\n" +
                "                   .'                       `._             *  '\n" +
                "   '       '                        .       .  `.     .\n" +
                "       .                      *                  `\n" +
                "               *        '             '                          .\n" +
                "     .                          *        .           *  *\n" +
                "             *        .                                    '";

        f1.add(new IndviFirework(ascFire[0]));
        f1.add(new IndviFirework(ascFire[1]));

        List<Firework> f2 = new ArrayList<>();

        f2.add(new IndviFirework(ascFire[0]));
        f2.add(new IndviFirework(ascFire[2]));
        f2.add(new PackageFirework(f1));
        f2.add(new PackageFirework( new IndviFirework(ascFire[2])));

        Event e = new Event(g,f2);

        e.candleOff();





    }

}
