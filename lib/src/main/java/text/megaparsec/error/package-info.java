package text.megaparsec.error;

/**
 *  Module      :  megaparsec.error
 * Copyright   :  © 2015–present Megaparsec contributors
 * License     :  FreeBSD
 *
 * Maintainer  :  Mark Karpov <markkarpov92@gmail.com>
 * Stability   :  experimental
 * Portability :  portable
 *
 * Parse errors. The current version of Megaparsec supports typed errors
 * instead of 'String'-based ones. This gives a lot of flexibility in
 * describing what exactly went wrong as well as a way to return arbitrary
 * data in case of failure.
 */