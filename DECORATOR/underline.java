public class underline extends textdecor{
        public underline(text decor)
        {
            super(decor);
        }
        public String style()
        {
            return "<u>" + super.style() + "</u>";
        }
    }

