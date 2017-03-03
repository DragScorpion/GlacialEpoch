::@echo off
for %%f in (*.tex) do (
pdflatex %%f
pdflatex %%f
del *.tox
del *.aux
del *.out
del *.log
del *.toc
move *.pdf ..\
)