%.dot: %.java
	javadoc -docletpath UmlGraph.jar -doclet UmlGraph -private $<
	mv graph.dot $@

%.eps: %.dot
	dot -Tps -o$@ $<

all: Diag.eps 
	dot -Tps -o distro.eps distro.dot
	dot -Tps -o dep-graph.eps dep-graph.dot
	dot -Tps -o conc-model.eps conc-model.dot
	latex declweb.tex
	bibtex declweb
	latex declweb.tex
	latex declweb.tex

show: all
	dvips declweb.dvi

clean:
	-rm -f *.aux
	-rm -f *.blg
	-rm -f *.dvi
	-rm -f *.log
	-rm -f *~
	-rm -f *.bbl
	-rm -f Diag.eps rankyear.eps distro.eps dep-graph.eps conc-model.eps
	-rm -f declweb.ps
	-rm -f *.backup
