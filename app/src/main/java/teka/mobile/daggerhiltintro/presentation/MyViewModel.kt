package teka.mobile.daggerhiltintro.presentation

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import teka.mobile.daggerhiltintro.domain.repository.MyRepository
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: dagger.Lazy<MyRepository>//lazy insinuates the repository object is not going to be created until it's required
): ViewModel() {

    init {
        repository.get()//this line launches the repository
    }

}