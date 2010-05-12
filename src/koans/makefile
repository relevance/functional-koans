SLHS_ALL = $(shell ls *.ℓhs)
SLHS_FUN = $(shell ls fun*.ℓhs)
SLHS_HOFUN = $(shell ls hofun*.ℓhs)

ELF = ${SLHS_ALL:%.ℓhs=%}

%.lhs: %.ℓhs
	sed -f toascii.sed $< > $@

%: %.lhs
	ghc -o $@ $<

%.koan: %
	@head -1 $<.ℓhs
	@./$<

clean:
	@rm -f *.lhs *.hi *.o

distclean: clean
	@rm -f ${ELF}

fun: ${SLHS_FUN:%.ℓhs=%} ${SLHS_FUN:%.ℓhs=%.koan}

hofun: ${SLHS_HOFUN:%.ℓhs=%} ${SLHS_HOFUN:%.ℓhs=%.koan}
