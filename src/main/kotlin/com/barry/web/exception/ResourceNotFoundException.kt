package com.barry.web.exception

import java.lang.RuntimeException

class ResourceNotFoundException(override val message: String?) : RuntimeException()