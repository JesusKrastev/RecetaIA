package com.jesuskrastev.recetaia.ui.features.generator

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FilterChip
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarScrollBehavior
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateMapOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.jesuskrastev.recetaia.ui.features.components.RoundedButton

@OptIn(ExperimentalLayoutApi::class, ExperimentalMaterial3Api::class)
@Composable
fun GeneratorScreen(
    modifier: Modifier = Modifier,
) {
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            GeneratorBottomBar()
        },
    ) { innerPadding ->
        Generator(
            modifier = Modifier.padding(innerPadding),
        )
    }
}

@Composable
fun GeneratorBottomBar(
    modifier: Modifier = Modifier,
) {
    BottomAppBar(
        modifier = modifier,
    ) {
        RoundedButton(
            modifier = Modifier.padding(horizontal = 16.dp),
            onClick = { /* Acción para generar recetas */ },
            text = "Generar receta",
        )
    }
}

@Composable
fun Generator(
    modifier: Modifier = Modifier,
) {
    val dietOptions = listOf("Estándar", "Vegano", "Vegetariano", "Keto", "Paleo", "Mediterránea")
    var selectedDiet by remember { mutableStateOf("Estándar") }

    val mealTimeOptions = listOf("Desayuno", "Comida", "Merienda", "Cena", "Snack")
    val nutritionalGoals = listOf("Alta proteína", "Bajo en carbohidratos", "Bajo en grasas")
    val checkedGoals = remember { mutableStateMapOf<String, Boolean>() }
    var selectedMealTime by remember { mutableStateOf("Desayuno") }
    var restrictions by remember { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp),
    ) {
        MealTime(
            options = mealTimeOptions,
            selectedOption = selectedMealTime,
            onOptionSelected = { selectedMealTime = it }
        )
        TypeDiet(
            options = dietOptions,
            selectedOption = selectedDiet,
            onOptionSelected = { selectedDiet = it }
        )
        NutritionalGoalsSelection(
            goals = nutritionalGoals,
            checkedGoals = checkedGoals,
            onGoalCheckedChange = { goal, isChecked ->
                checkedGoals[goal] = isChecked
            },
        )
        DietaryRestrictions(
            restrictions = restrictions,
            onRestrictionsChange = { restrictions = it }
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MealTime(
    modifier: Modifier = Modifier,
    options: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            text = "Comida del día",
            style = MaterialTheme.typography.titleMedium,
        )
        MealTimes(
            options = options,
            selectedOption = selectedOption,
            onOptionSelected = onOptionSelected,
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun MealTimes(
    modifier: Modifier = Modifier,
    options: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
) {
    FlowRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        options.forEach { option ->
            FilterChip(
                selected = selectedOption == option,
                onClick = { onOptionSelected(option) },
                label = { Text(option) }
            )
        }
    }
}

@Composable
fun DietaryRestrictions(
    modifier: Modifier = Modifier,
    restrictions: String,
    onRestrictionsChange: (String) -> Unit,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        Text(
            text = "Restricciones alimentarias",
            style = MaterialTheme.typography.titleMedium,
        )
        OutlinedTextField(
            value = restrictions,
            onValueChange = onRestrictionsChange,
            placeholder = { Text("Sin gluten, sin lácteos, etc.") },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Composable
fun NutritionalGoalsSelection(
    modifier: Modifier = Modifier,
    goals: List<String>,
    checkedGoals: Map<String, Boolean>,
    onGoalCheckedChange: (String, Boolean) -> Unit,
) {
    Column(
        modifier = modifier
    ) {
        Text(
            text = "Objetivos nutricionales",
            style = MaterialTheme.typography.titleMedium,
        )
        NutritionalGoals(
            goals = goals,
            checkedGoals = checkedGoals,
            onGoalCheckedChange = onGoalCheckedChange,
        )
    }
}

@Composable
fun NutritionalGoals(
    modifier: Modifier = Modifier,
    goals: List<String>,
    checkedGoals: Map<String, Boolean>,
    onGoalCheckedChange: (String, Boolean) -> Unit,
) {
    Column(
        modifier = modifier,
    ) {
        goals.forEach { goal ->
            NutritionalGoal(
                goal = goal,
                checkedGoals = checkedGoals,
                onGoalCheckedChange = onGoalCheckedChange
            )
        }
    }
}

@Composable
fun NutritionalGoal(
    modifier: Modifier = Modifier,
    goal: String,
    checkedGoals: Map<String, Boolean>,
    onGoalCheckedChange: (String, Boolean) -> Unit,
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clickable {
                val currentStatus = checkedGoals.getOrDefault(goal, false)
                onGoalCheckedChange(goal, !currentStatus)
            },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Checkbox(
            checked = checkedGoals.getOrDefault(goal, false),
            onCheckedChange = { isChecked -> onGoalCheckedChange(goal, isChecked) }
        )
        Text(
            text = goal,
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun TypeDiet(
    modifier: Modifier = Modifier,
    options: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
) {
    Column(
        modifier = modifier,
    ) {
        Text(
            text = "Tipo de dieta",
            style = MaterialTheme.typography.titleMedium
        )
        Diets(
            options = options,
            selectedOption = selectedOption,
            onOptionSelected = onOptionSelected,
        )
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Diets(
    modifier: Modifier = Modifier,
    options: List<String>,
    selectedOption: String,
    onOptionSelected: (String) -> Unit,
) {
    FlowRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        options.forEach { option ->
            FilterChip(
                selected = selectedOption == option,
                onClick = { onOptionSelected(option) },
                label = { Text(option) }
            )
        }
    }
}