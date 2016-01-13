// Copyright (c) 2015, Intel Corporation
// All rights reserved.
//
// Redistribution and use in source and binary forms, with or without
// modification, are permitted provided that the following conditions are
// met:
//
// 1. Redistributions of source code must retain the above copyright
// notice, this list of conditions and the following disclaimer.
// 2. Redistributions in binary form must reproduce the above
// copyright notice, this list of conditions and the following disclaimer
// in the documentation and/or other materials provided with the
// distribution.
// 3. Neither the name of the copyright holder nor the names of its
// contributors may be used to endorse or promote products derived from
// this software without specific prior written permission.
//
// THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
// "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
// LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
// A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
// HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
// SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
// LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
// DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
// THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
// (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
// OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.


package com.lib.ui.struct;


import com.intel.inde.moe.natj.c.StructObject;
import com.intel.inde.moe.natj.c.ann.Structure;
import com.intel.inde.moe.natj.c.ann.StructureField;
import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ptr.BytePtr;
import com.intel.inde.moe.natj.general.ptr.VoidPtr;

@Generated
@Structure()
public final class sqlite3_vtab extends StructObject {
	static {
		NatJ.register();
	}
	private static long __natjCache;

	@Generated
	public sqlite3_vtab() {
		super(sqlite3_vtab.class);
	}

	@Generated
	protected sqlite3_vtab(Pointer peer) {
		super(peer);
	}

	@Generated
	public sqlite3_vtab(VoidPtr pModule, int nRef, BytePtr zErrMsg) {
		super(sqlite3_vtab.class);
		setPModule(pModule);
		setNRef(nRef);
		setZErrMsg(zErrMsg);
	}

	@Generated
	@StructureField(order = 0, isGetter = true)
	public native VoidPtr pModule();

	@Generated
	@StructureField(order = 0, isGetter = false)
	public native void setPModule(VoidPtr value);

	@Generated
	@StructureField(order = 1, isGetter = true)
	public native int nRef();

	@Generated
	@StructureField(order = 1, isGetter = false)
	public native void setNRef(int value);

	@Generated
	@StructureField(order = 2, isGetter = true)
	public native BytePtr zErrMsg();

	@Generated
	@StructureField(order = 2, isGetter = false)
	public native void setZErrMsg(BytePtr value);
}