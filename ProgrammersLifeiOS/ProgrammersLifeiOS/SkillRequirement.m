//
//  SkillRequirement.m
//  ProgrammersLifeiOS
//
//  Created by Zackary T Misso on 7/6/15.
//  Copyright © 2015 Zackary Misso. All rights reserved.
//

#import "SkillRequirement.h"
#import "Skill.h"

@implementation SkillRequirement

-(id)init{
    if(self = [super init]){
        skill = NULL;
        neededLevel = -1;
    }
    return self;
}

-(BOOL)checkRequirement{
    if([skill getLevel] >= neededLevel)
        return YES;
    return NO;
}

// getter methods
-(Skill*)getSkill { return skill; }
-(int)getNeededLevel { return neededLevel; }

// setter methods
-(void)setSkill:(Skill*)value { skill = value; }
-(void)setNeededLevel:(int)value { neededLevel = value; }

@end
